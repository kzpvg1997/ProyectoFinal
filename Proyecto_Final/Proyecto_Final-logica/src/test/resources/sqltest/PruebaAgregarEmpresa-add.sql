INSERT INTO proyecto_final.tb_departamento(id_departamento, nombre) VALUES (6, 'Risaralda');
INSERT INTO proyecto_final.tb_ciudad(id_ciudad, nombre, id_departamento) VALUES (5, 'Pereira', 6);
INSERT INTO proyecto_final.tb_sectorlaboral(id_sector, nombre) VALUES (3, 'Comercial');
INSERT INTO proyecto_final.tb_empresa(id_empresa, citio_web, direccion, fax, razon_social, telefono, tipo_empresa, id_ciudad, id_sector) VALUES (2, 'www.leganPizza.com', 'Montenegro', '57', 'Pizza', '316', 'COOPERATIVA', 5, 1);