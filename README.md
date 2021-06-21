# Proyecto Reserva de hotel

Proposito:
La aplicación es bastante sencilla, basicamente le va solicitar al usuario ingresar fechas que desea visitar el lugar, su nombre, cedula, cantidad de noches que desea reservar, el tipo de pago, su nacionalidad y correo electronico.
Al momento de llenar todos los campos el sistema le va indicar al cliente que lo estaran contactando ya que el hotel funciona por "first come, first serve" por lo tanto en 24 horas le contactarian al cliente para confirmar si su solicitud fue aprobada o no.


Requerimientos:

- Datos personales (Nombre, Cedula, Tipo de pago, nacionalidad y Correo Electronico.)

- Datos de reserva (cantidad de noches, fecha de entrada y fecha de salida.)

- Usuario debe esperar un lapso de 24 horas para que le confirmen por correo electronico si su solicitud fue aprobada o no.

Nota: 
Cantidad de noches se solicita aún cuando se pidieron anteriormente las fechas de entrada y salida ya que los clientes tienen opción de poder pasar el día en el hotel sin necesidad de quedarse a dormir.
Se pensó en que fuera un hotel donde la salida al día siguiente no sea tan estricta como es hoy en dia en la mayoria de hoteles, donde a las 10-11 am ya se debe abandonar el hotel.

Ejemplo: una reserva puede ser de 1 noche/1 día teniendo la posibilidad de salir maximo de las 4 pm.

Funcionalidad:

- Un hotel poco usual el cual se trabaja por lista de espera y por solicitud, es decir los usuarios envian sus datos juntos con preferencias de fechas y cuando se reciba dicha información se le indicaria al usuario si hay espacio o no ya que el formato es diferente y los clientes pueden incluso reservar solo para pasar el dia sin necesidad de quedarse a dormir.

- Al darle run si se prueba en consola/IDE se tendra que ir escribiendo los datos que el sistema le solicite al usuario y al finalizar por medio de un "if" le va indicar al usuario el monto en dolares por noche dependiendo si es nacional o extranjero.

- Al darle run y usar la interfaz o "FrontEnd" creado entonces el cuadro va aparecer con los datos que el usuario debe llenar, este consta de "checkbuttons" y el botón "enviar" el cual se usa al haber llenado toda la información y mostrar el msj de que se le estaria contactando en caso de que si exista disponibilidad en las fechas indicadas.


Link a UML: https://drive.google.com/file/d/10Wqvqmt2iwTMOJg96-Sht6wcM7l6gS1U/view?usp=sharing