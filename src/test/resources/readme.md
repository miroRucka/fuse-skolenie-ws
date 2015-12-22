vlastne vygenerovanie private / public (cert)

vygenerovanie privatneho kluca pre clienta a vyexportovanie cert ktory bude mat server

keytool -genkey -alias client -keypass key-pass -keystore \client.jks -storepass client-pass -dname "cn=client" -keyalg RSA

keytool -selfcert -alias client -keystore \client.jks -storepass client-pass -keypass key-pass

keytool -export -alias client -file \client.rsa -keystore \client.jks -storepass client-pass


vygenerovanie privatneho kluca pre server a vyexportovanie cert ktory bude mat client

keytool -genkey -alias server -keypass key-pass -keystore \server.jks -storepass server-pass -dname "cn=server" -keyalg RSA

keytool -selfcert -alias server -keystore \server.jks -storepass server-pass -keypass key-pass

keytool -export -alias server -file \server.rsa -keystore \server.jks -storepass server-pass


naimportovanie trust cert

keytool -import -alias server  -file \server.rsa -keystore \client.jks -storepass client-pass

keytool -import -alias client  -file \client.rsa -keystore \server.jks -storepass server-pass