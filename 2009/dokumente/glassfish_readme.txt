Glassfish installieren, gro�es Profil

Dom�ne (Serverinstanz) erzeugen: bin/asadmin create-domain --adminport 4848 testdomain
Serverinstanz starten: bin/asadmin start-domain testdomain
Serverinstanz stoppen: bin/asadmin stop-domain testdomain
Admin-Console: http://localhost:4848
(HTTP f�r eigene Anwendungen l�uft auf 8080)
OSGi-Console ist unter Port 6666 zu erreichen (telnet localhost 6666)

[glassfish-folder]/glassfish/modules <- hier sind die OSGi Bundles zu finden, die die Serverinfrastruktur darstellen
[glassfish-folder]/glassfish/domains <- hier sind die Serverinstanzen bzw. Domains zu finden
[glassfish-folder]/glassfish/domains/testdomain/autodeploy/bundles <- Bundles, die nur f�r diese Serverinstanz sichtbar sind (Autostart)
 
