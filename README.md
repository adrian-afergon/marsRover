# Mars rober kata

[Esta es la kata][link] que hemos realizado

Equipo que ha participado:

- Adri
- Mireia
- Cristian

[link]:http://kata-log.rocks/mars-rover-kata

## Discurciones sobre la implementación

move([f,f,f,f,f,r,r])

move --> executeSequence()

commands([f,f,f,f]) && execute()

rober.move(Backwards) && Backwards = 'b'

nos quedamos con exequte(commands)

## todo list

- [X] saber la posicion actual
- [X] avanzar
- [X] retroceder
- [ ] giro sobre si mismo
- [ ] array de comandos
    - si a mitad de los comandos explota debemos saber donde se encuentra??
- [X] cuando empezamos tenemos una posicion y una direccion
- [ ] obstaculos en el "mapa"
- [ ] los commands los inicializamos con un ArrayList y eso es malo porque conocemos la implementaicon deberiamos embeberlo con una clase
- [ ] estaria bien tener un ente externo que sea lo que hace el movimiento y otro para el sensor de obstaculos

## obstacles

Para los obstaculos podemos lanzar excepciones en el momento de la colisión

## position y direction

Queremos tener un objeto con la posicion actual X e Y y la direccion??
- Si lo ponemos todo junto que nombre le damos?? Tiene sentido??
    - location
    - position
        
Es mejor tenerlo separado la direccion por un lado [N S E W] y por otro la poscicion X e Y (suponiendo que estamos en un plano de dos dimensiones)

Ahoramismo position es lo que indica la posicion [X Y] y en punto cardinal le decimos la direccion a la que esta mirando

## commands

Los comandos deben ir juntos o separados? Tienen dos comportamientos distintos unos son de movimiento y otros de giro

  - commands(b, f, b, b, b) las F y las B son comandos de un enum de la propia clase internamente esta clase tiene un array list o lo que sea.
  - Desde fuera tiene el constructor y el get commands (supongo)
