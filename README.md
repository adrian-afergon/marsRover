# Mars rober kata

[Esta es la kata][link]

Tenemos un equipazo:

- Adri
- Mireia
- Cristian

[link]:http://kata-log.rocks/mars-rover-kata

## discurciones de medianoche
move([f,f,f,f,f,r,r])
move --> executeSequence()

commands([f,f,f,f]) && execute()
rober.move(Backwards) Backwards = 'b'

nos quedamos con exequte(commands)

## todo list

- [X] saber la posicion actual
- [X] avanzar
- [X] pa tras
- [ ] giro sobre si mismo
- [ ] array de comandos
    - si a mitad de los comandos explota debemos saber donde fue??
- [X] cuando empezamos tenemos una posicion y una direccion en el objeto
- [ ] obstaculos en el "mapa"

## obstacles

Para los obstaculos podemos lanzar excepciones

## position y direction

Queremos tener un objeto con la posicion actual X e Y y la direccion??
- Si lo ponemos todo junto que nombre le damos?? Tiene sentido 
    - location
    - position
        
Es mejor tenerlo separado la direccion por un lado [N S E W] y por otro la poscicion X e Y

Ahoramismo position es lo que indica la posicion [X y] y en punto cardinal le decimos la direccion a la que esta mirando


## commands

Los comandos deben ir juntos o separados, tienen dos comportamientos distintos unos son de movimiento y otro de giro?

  - los commands los inicializamos con un ArrayList y eso es malo porque conocemos la implementaicon deberiamos embeberlo con una clase o aaarrrgoo mi niño
  - commands(b, f, b, b, b) las F y las B son comandos de un enum de la propia clase internamente esta clase tiene un array list o lo que sea.
  - Desde fuera tiene el constructor y el get commands (supongo)

## cosas

estaria bien tener un ente externo que sea lo que hace el movimiento y otro para el sensor