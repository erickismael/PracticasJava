class Alumno{
    Strign nombre;
    Materias materias[];
    public Alumno(String nombre, Materias m[]){
        this.nombre = nombre;
        materias = m;
    }
    void verPromedio(){
        int total = 0;
        for(Materias m: materias){
            total += m.calificacion();
        }
        for(int i=0;i<materias.length;i++){
            total += materias[i].calificacion();
        }
        System.out.println("Promedio: " + total/materias.length);
        //System.out.println("Promedio: " + total/materias.length + "/n");
    }
}