1. Extract Class (Extraer Clase)
En la clase main se incluyo el uso del método getValidInt con la finalidad de manejar un control de excepciones sobre la entrada del usuario en las variable from y to.

2. Introduce Parameter (Introducir Parámetro)
En la clase InputValidator se observa el uso del parámetro message en getValidInt(String message), esto para evitar el uso de System.out.print() y que el método sea mas reutilizable.

3. Encapsulate Field (Encapsular Campo)
En la misma clase InputValidator existe un atributo privado Scanner scanner abogando por el encapsulamiento y eliminando el Scanner input que antes era una variable suelta en Main.

4. Extract Method (Extraer Método)
En la clase ConsoleBasedFizzBuzz el método print fue reestructurado para que su función sea solo imprimir, la demás parte lógica ahora la realizan en conjunto otros métodos.
