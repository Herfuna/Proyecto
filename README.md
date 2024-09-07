Diagrama de Clases del proyecto:
![proyectoo](https://github.com/user-attachments/assets/8dd5d0bc-e1dd-4fe0-82f3-7f09f601d21c)


# Como funciona?
Funciona por una arraylist, que se crea como una variable global


# Boton Guardar:
El usuario al darle click en el boton guardar, esta se asigna a la clase creada llamada alumnos, para posterior que esta se guarde en una lista
# Boton siguiente:
El indice el clave, ya que gracias a este es que se puede mostrar donde esta posicionado el usuario y a su vez es indicador para agregar y mostrar los datos.
Se crea una condicion de que si el tamaño de la lista es igual al indice, esta muestre los datos almanenados en esta posicion, de lo contrario si no hay nada, los campos se limpian.

# Boton Anterior:
Muestra los datos que haya en la posicion del indice, si es que ya se a guardado datos en la lista, el indice no puede bajar de 0.

# Funcion Guardar:
Funcion que recibe una lista, esta lista se hace cuando el usuario le da al boton  guardar.
Se crea el archivo de texto.
Se recorre la lista, que a su vez va guardado los datos, separandolos por un tab(\t),  este tab servirá para cuando querramos leer.

# Funcion Leer:
Se abre el archivo.
Con un while se recorre linea por linea.
Se crea bloques, que con la ayuda del slip se separa los datos por tab y se almacenan en la clase Alumnos y tambien una lista

![image](https://github.com/user-attachments/assets/e9de4da2-56a4-4eda-8760-8dc2e77f66f8)


