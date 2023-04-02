public class Coche {
    public int velocidad;

    public void acelerar_JoseDanielGuijarro(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_JoseDanielGuijarro(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0) 
            velocidad = 0;
    }
}
