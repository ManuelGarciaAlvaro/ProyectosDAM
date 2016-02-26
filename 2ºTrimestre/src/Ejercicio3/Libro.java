package Ejercicio3;

public class Libro {
		String nombre;
	    String autor;
	    int numerolibros;
	    int librosprestados;
	    public Libro() {
	    }
	    //constructor y parámetros
	    public Libro(String titulo, String autor, int ejemplares, int prestados) 
	    {
	        this.nombre = titulo;
	        this.autor = autor;
	        this.numerolibros = ejemplares;
	        this.librosprestados = prestados;
	    }

	    public String getAutor()
	    {
	        return autor;
	    }

	    public void setAutor(String autor)
	    {
	        this.autor = autor;
	    }

	    public int getEjemplares() 
	    {
	        return numerolibros;
	    }

	    public void setEjemplares(int ejemplares) 
	    {
	        this.numerolibros = ejemplares;
	    }

	    public int getPrestados() 
	    {
	        return librosprestados;
	    }

	    public void setPrestados(int prestados) 
	    {
	        this.librosprestados = prestados;
	    }

	    public String getTitulo() 
	    {
	        return nombre;
	    }

	    public void setTitulo(String titulo) 
	    {
	        this.nombre = titulo;
	    }

	    //prestamo libro
	    public boolean prestamo() 
	    {
	        boolean prestado = true;
	        if (librosprestados < numerolibros) 
	        {
	            librosprestados++;
	        } 
	        else
	        {
	            prestado = false;
	        }
	        return prestado;
	    }

	    //devolver libro
	    public boolean devolucion() 
	    {
	        boolean devuelto = true;
	        if (librosprestados == 0) 
	        {
	            devuelto = false;
	        } 
	        else
	        {
	            librosprestados--;
	        }
	        return devuelto;
	    }
	    public String toString() 
	    {
	        return "titulo: " + nombre + "\nautor: " + autor +
	                  "\nejemplares: " + numerolibros + "\nprestados: " + librosprestados;
	    }
	   
	}

