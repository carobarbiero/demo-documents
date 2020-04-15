DROP TABLE IF EXISTS documento;
CREATE TABLE documento (
    id_documento        INTEGER auto_increment PRIMARY KEY,
    id_cuenta           INTEGER NOT NULL,
    id_tipo_documento   INTEGER NOT NULL,
    referencia_documento VARCHAR NOT NULL,
    usuario_alta        VARCHAR,
    fecha_alta          DATE,
    version             INTEGER
);
DROP TABLE IF EXISTS tipo;
CREATE TABLE tipo (
    id_tipo             INTEGER auto_increment PRIMARY KEY,
    codigo              VARCHAR NOT NULL,
    descripcion         VARCHAR
);
