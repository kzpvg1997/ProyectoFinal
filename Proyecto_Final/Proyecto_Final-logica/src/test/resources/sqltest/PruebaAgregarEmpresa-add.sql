INSERT INTO proyecto_final.tb_departamento(id_departamento, nombre) VALUES (4, 'Risaralda');
INSERT INTO proyecto_final.tb_ciudad(id_ciudad, nombre, id_departamento) VALUES (4, 'Pereira', 4);
INSERT INTO proyecto_final.tb_sectorlaboral(id_sector, nombre) VALUES (3, 'Comercial');
INSERT INTO proyecto_final.tb_empresa(id_empresa, citio_web, direccion, fax,nombre_empresa, razon_social, telefono, tipo_empresa, id_ciudad, id_sector) VALUES (2, 'www.leganPizza.com', 'Montenegro', '57', 'LegganPizas', 'Pizza', '316', 'COOPERATIVA', 4, 3);