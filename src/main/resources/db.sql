-- Insertar un usuario inicial en la base de datos
INSERT INTO usuario (username, email, password, fecha_creacion, ultima_sesion, fecha_nac, estado_usuario)
VALUES
('adminUser', 'admin@example.com', 'adminPassword', CURRENT_DATE, CURRENT_DATE, null, 'INACTIVO');

-- Asegúrate de que el estado 'ACTIVO' coincida con el valor definido en el enum EstadoUsuario
