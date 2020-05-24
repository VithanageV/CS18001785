object Fahern extends App{
    def convert(p:Double)=(3+0.75*(p-50))+ p*(24.95-24.95*0.4);

    println(convert(60));
}
