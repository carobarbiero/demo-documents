-- -----------------------------------------------------------------------------
-- documento
-- -----------------------------------------------------------------------------
DELETE FROM documento;
INSERT INTO documento
(id_documento, id_cuenta, id_tipo_documento, referencia_documento) VALUES
(1,            100,       1,                 'referencia1'),
(2,            100,       1,                 'referencia2');

-- -----------------------------------------------------------------------------
-- tipo
-- -----------------------------------------------------------------------------
DELETE FROM tipo;
INSERT INTO tipo
(id_tipo, codigo, descripcion  ) VALUES
(1,       'A'   , 'TIPO A');
