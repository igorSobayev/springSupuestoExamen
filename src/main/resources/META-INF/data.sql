INSERT INTO  visitadores ( idvisitador , nombre ) VALUES (1, 'Sabino');
INSERT INTO  visitadores ( idvisitador , nombre ) VALUES (2, 'Carmen');
INSERT INTO partes ( idparte , numparte , fecha ,  totalgastos , idvisitador) VALUES (1, 'TZ1', '2019-01-01', 30, 1);
INSERT INTO partes ( idparte , numparte , fecha ,  totalgastos , idvisitador) VALUES (2, 'TZ2', '2019-01-01', 30, 1);
INSERT INTO partes ( idparte , numparte , fecha ,  totalgastos , idvisitador) VALUES (3, 'TZ3', '2019-01-01', 30, 2);
INSERT INTO gastos ( idgastos , denominacion ) VALUES (1,'hotel'),(2,'dietas'),(3,'kilometros');
INSERT INTO lineasparte ( idpartegastos , fecha ,  importe, idgastos , idparte ) VALUES (1, '2019-02-01', 500, 1, 1); 
INSERT INTO lineasparte ( idpartegastos , fecha , importe, idgastos , idparte ) VALUES (2, '2019-01-30',  100, 1, 1); 
INSERT INTO lineasparte ( idpartegastos , fecha , importe , idgastos, idparte) VALUES (3, '2019-01-30',  50, 1, 2);
INSERT INTO lineasparte ( idpartegastos , fecha , importe , idgastos, idparte ) VALUES (4, '2019-01-29',  60, 1, 2);
INSERT INTO lineasparte ( idpartegastos , fecha , importe , idgastos, idparte ) VALUES (5, '2019-01-28', 120, 1, 3);
INSERT INTO lineasparte ( idpartegastos , fecha ,  importe , idgastos, idparte ) VALUES (6, '2019-02-01', 500, 2, 1); 
INSERT INTO lineasparte ( idpartegastos , fecha , importe , idgastos, idparte ) VALUES (7, '2019-01-30',  100, 2, 1); 
INSERT INTO lineasparte ( idpartegastos , fecha , importe , idgastos, idparte ) VALUES (8, '2019-01-30',  50, 2, 2);
INSERT INTO lineasparte ( idpartegastos , fecha ,  importe, idgastos , idparte ) VALUES (9, '2019-02-01', 500, 3, 1); 
INSERT INTO lineasparte ( idpartegastos , fecha , importe , idgastos, idparte ) VALUES (10, '2019-01-30',  100, 3, 1); 
INSERT INTO lineasparte ( idpartegastos , fecha , importe, idgastos , idparte ) VALUES (11, '2019-01-30',  50, 3, 2);


