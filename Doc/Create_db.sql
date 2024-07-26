

-- todos las tablas "estado" o "tipo" seran enums dentro de models, las demas son entitys de dataJPA spring

--tablas de eventos para el juego
create table tipoEvento (  --esta tabla seria un enum para los entitys de jpa
    int id identity not null,
    evento enum  --economico,daño,vida, loot, recarga,
)
--tabla necesarias para un jugador
create table inicial (
    int id identity not null,
    varchar (200) detalle not null,
    varchar (1000) img_url not null,
)
create table inicialXEventos(
    int id identity null,
    int  fk id_tipoEvento
    int  fk id_inicial
)
create table personaje (
    int id identity not null,
    varchar (200) detalle not null,
    int vida not null,
    int ataque not null,
    int fk id_inicial not null,
    varchar (1000) img_url not null,
    bool fueusada   --porque si se uso una vez ya no se puede usar hasta recargarla o que vuelva a ser tu turno
)
create table personajeXEventos(
    int id identity null,
    int  fk id_tipoEvento
    int fk id_personaje
)

--tablas de usuario
create table estadoUsuario (--esta tabla seria un enum para los entitys de jpa
    int id identity not null,
    estado enum --activo, inactivo, baneado
)
--tabla para un usuario
create table usuario (
    int id identity not null,
    varchar username,
    varchar email,
    varchar password,
    date fechaCreacion,
    date ultimasecion,
    date fechaNac,
    int fk id_estadoUsuario
)
--tabla de cartas
create table tipoCarta (--esta tabla seria un enum para los entitys de jpa
    int id identity not null,
    estado enum --mounstro, tesoro, baratijas
)
create table cartas (
    int id identity not null,
    varchar nombre
    varchar descripcion
    int fk fk id_tipoCarta
    int amount // en caso de ser de daño hara *amount* de daño en caso de ser dinero hara amount de dinero
)
create table cartaXEventos(
    int id identity null,
    enum  fk fk id_tipoEvento
    int  fk id_carta
)
---tablas para el juego
create table estadoJuego (--esta tabla seria un enum para los entitys de jpa
    int id identity not null,
    estado enum --finalizado, EnCurso
)
create table juego (
    int id identity not null,
    date fechaCreacion,
    date fechaTerminado,
    enum fk id_estadoJuego
)
--tablas de jugadores
create table estadoJugador (--esta tabla seria un enum para los entitys de jpa
    int id identity not null,
    estado enum--vivo, muerto
)
--tabla del jugador
create table jugador (
    int id identity not null,
    bigdecimal balance,
    int ordenJugador , --del 1 al 4 (ya que solo se permiten 4 jugadores)
    int fk id_estadoJugador, 
    int fk id_usuario,
    int fk id_juego,
    int fk id_personaje,
    bool gano not null-- booleando indicando si gano o no el juego false si todavia no gano o no gano
)
--union de cartas y jugadores
create table cartaXjugador (
    int id identity not null,
    int fk id_carta,
    int fk id_jugador not null,
)