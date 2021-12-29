package com.example.orientacion.bd;

import com.example.orientacion.R;
import com.example.orientacion.bd.Model.areas;
import com.example.orientacion.bd.Model.carreras;
import com.example.orientacion.bd.Model.preguntas;
import com.example.orientacion.bd.Model.respuestas;
import com.example.orientacion.bd.Model.resultados;

import java.util.ArrayList;

public class Datos {

public ArrayList<carreras> returnCarreras(){
    ArrayList<carreras> carreras=new ArrayList<>();
    carreras.add(new carreras(1,"Bachillerato en ciencias y letras con orientación en computación."));
    carreras.add(new carreras(2,"Bachillerato en ciencias y letras con orientación en diseño gráfico."));
    carreras.add(new carreras(3,"Bachillerato en ciencias y letras con orientación en electricidad."));
    carreras.add(new carreras(4,"Bachillerato en ciencias y letras con orientación en cocina nacional e internacional."));
    carreras.add(new carreras(5,"Bachillerato en ciencias y letras con orientación en educación física."));
    carreras.add(new carreras(6,"Bachillerato en ciencias y letras con orientación en educación musical."));
    carreras.add(new carreras(7,"Bachillerato en ciencias y letras con orientación en mecánica automotriz."));
    carreras.add(new carreras(8,"Bachillerato en ciencias y letras con orientación en turismo."));
    carreras.add(new carreras(9,"Bachillerato en construcción."));
    carreras.add(new carreras(10,"Bachillerato en ciencias en medicina"));
    carreras.add(new carreras(11,"Bachillerato en ciencias y letras con orientacion juridica"));
    carreras.add(new carreras(12,"Perito contador con orientación en computación."));
    carreras.add(new carreras(13,"Perito en administración."));
    carreras.add(new carreras(14,"Bachillerato en educacion."));
    carreras.add(new carreras(15,"Perito en electrónica y dispositivos digitales."));
    carreras.add(new carreras(16,"Perito en mercadotecnia y publicidad."));
    carreras.add(new carreras(17,"Secretariado bilingüe con orientación en computación."));
    return carreras;
}

public ArrayList<areas> returnAreas(){
    ArrayList<areas> area=new ArrayList<>();
    area.add(new areas(1,"Lógica"));
    area.add(new areas(2,"Matemática"));
    area.add(new areas(3,"Gustos"));
    area.add(new areas(4,"Sociales"));
    return area;
}

public ArrayList<preguntas> returnPregutas(){
      ArrayList<preguntas> preguntas=new ArrayList<>();
        preguntas.add(new preguntas(1,1,"¿Cuántos números 9 hay del 1 al 100?"));
        preguntas.add(new preguntas(2,1,"¿que paso ayer en xela de 7 a 8?"));
        preguntas.add(new preguntas(3,1,"¿Cuántos animales de cada especie metió Moisés en su arca?"));
        preguntas.add(new preguntas(4,1,"¿Cada uno de tres hermanos tiene una hermana ¿cuantos suman todos?"));
        preguntas.add(new preguntas(5,1,"¿Cuántos meses tienen 28 días durante un período de 8 años?"));
        preguntas.add(new preguntas(6,1,"¿Un granjero tiene 17 vacas, todas mueren menos nueve, ¿Cuantas le quedan?"));
        preguntas.add(new preguntas(7,1,"¿Divide 30 por 0,5 y le sumas 10, ¿resultado?"));
        preguntas.add(new preguntas(8,1,"¿Qué es mayor medio metro cuadrado o la mitad de un metro cuadrado?"));
        preguntas.add(new preguntas(9,1,"¿Si me encuentro en una maratón y en plena carrera mi persona le gana al segundo, en qué posición llego?"));
        preguntas.add(new preguntas(10,1,"¿Cuántas veces es más rápida la manilla del minutero que la de las horas en un reloj?"));

    preguntas.add(new preguntas(11,2,"Hay 5 estuches en la mesa. Cada uno contiene 10 lápices, ¿Cuántos lápices son en total?"));
    preguntas.add(new preguntas(12,2,"¿Cuál es la raíz cuadrada de 100?"));
    preguntas.add(new preguntas(13,2,"Cada estudiante puede elegir entre 4 tipos de sudadera y tres tipos de pantalones en su uniforme, ¿cuántas combinaciones posibles existen?"));
    preguntas.add(new preguntas(14,2,"3 (x-4) = 18. ¿Cuál es el valor de X?"));
    preguntas.add(new preguntas(15,2,"4 x 4 - 4 + 4 x 4 = ¿...?"));
    preguntas.add(new preguntas(16,2,"¿Cuál de los siguientes números tiene el digito 2 en el lugar de las decenas??"));
    preguntas.add(new preguntas(17,2,"¿A cuánto equivale π?"));
    preguntas.add(new preguntas(18,2,"Por un bolso hemos pagado 50 quetzales, más el 12% de IVA. ¿Cuánto hemos tenido que pagar en total?"));
    preguntas.add(new preguntas(19,2,"¿Cuántas flores hay en dos docenas de rosas?"));
    preguntas.add(new preguntas(20,2,"¿Por cuánto tenemos que multiplicar el 6 para obtener 36?"));

    //imagenes
    preguntas.add(new preguntas(21,3,"Seleccione dos imagenes que le gusta"));
    //social
    preguntas.add(new preguntas(22,4,"¿Crees que el detalle es importante?"));
    preguntas.add(new preguntas(23,4,"¿Organizas bien tu dinero?"));
    preguntas.add(new preguntas(24,4,"¿Crees que es mejor trabajar individual que en equipo?"));
    preguntas.add(new preguntas(25,4,"¿Alguna vez has pensado lo mismo que algún filosofo reconocido?"));
    preguntas.add(new preguntas(26,4,"¿Crees que tus ideas son importantes para ponerlos en práctica?"));
    preguntas.add(new preguntas(27,4,"¿Cuando ves sangre te asustas rapidamente?"));
    preguntas.add(new preguntas(28,4,"A parte de los libros que te mandan en la escuela ¿con qué frecuencia lees?"));
    preguntas.add(new preguntas(29,4,"¿Qué haces cuando estás enfermo y te mandan tomar un medicamento?"));
    preguntas.add(new preguntas(30,4,"del 1 al 10 ¿Qué tan bien te llevas con la computadora?"));
    preguntas.add(new preguntas(31,4,"¿Te interesa saber cómo funcionan aparatos que usas a diario como el celular, la televisión o la computadora?"));

    preguntas.add(new preguntas(32,4,"En general ¿te gusta resolver problemas matemáticos?"));
    preguntas.add(new preguntas(33,4,"El funcionamiento de la célula te parece:"));
    preguntas.add(new preguntas(34,4,"¿Te gustaría estudiar en profundidad un idioma?"));
    preguntas.add(new preguntas(35,4,"¿Cómo te sientes cuando hablas en público?"));
    preguntas.add(new preguntas(36,4,"¿Dedicas algunos días para realizar ejercicio?"));
    preguntas.add(new preguntas(37,4,"¿Te gusta el deporte?"));
    preguntas.add(new preguntas(38,4,"¿Estas informado sobre las nuevas tecnológicas que se están inventando?"));
    preguntas.add(new preguntas(39,4,"¿Te gustaría saber cómo funciona tu cuerpo?"));
    preguntas.add(new preguntas(40,4,"¿Las técnicas de primeros auxilios...?"));
    preguntas.add(new preguntas(41,4,"¿En comparación con gente de tu edad, destacas en música, creatividad u otra forma de arte?"));

    preguntas.add(new preguntas(42,4,"¿Te gustaría aprender a ejecutar algún instrumento musical?"));
    preguntas.add(new preguntas(43,4,"¿Consideras importante que desde la escuela se fomente la actitud crítica?"));
    preguntas.add(new preguntas(44,4,"¿Cuándo eras pequeño te interesaba saber cómo funcionaban los juguetes?"));
    preguntas.add(new preguntas(45,4,"¿Consideras que la salud pública debe ser prioritaria y gratuita?"));
    preguntas.add(new preguntas(46,4,"¿Sabes que es la macroeconomía y microeconomía?"));
    preguntas.add(new preguntas(47,4,"¿Con qué frecuencia visitas una exposición artística?"));
    preguntas.add(new preguntas(48,4,"¿Qué haces cuando se descompone algún electrodoméstico en casa?"));
    preguntas.add(new preguntas(49,4,"¿Cuándo escuchas una canción le pones atención a los sonidos de los instrumentos?"));
    preguntas.add(new preguntas(50,4,"¿Te gusta dibujar?"));
    preguntas.add(new preguntas(51,4,"¿Te gustaría conocer terminos de medicina?"));

    preguntas.add(new preguntas(52,4,"¿Piensas que es bueno saber las leyes de nuestro país?"));
    preguntas.add(new preguntas(53,4,"¿Te interesa saber el funcionamiento de un carro?"));
    preguntas.add(new preguntas(54,4,"¿Te gustaria dirigir un grupo musical?"));
    preguntas.add(new preguntas(55,4,"¿Te gustaría arreglar algún electrodoméstico?"));
    preguntas.add(new preguntas(56,4,"¿Te gustaría pintar algún cuadro de paisaje?"));
    preguntas.add(new preguntas(57,4,"¿Te interesaría ser un especialista en publicidad gráfica?"));
    preguntas.add(new preguntas(58,4,"¿Te interesaría realizar diseños publicitarios?"));
    preguntas.add(new preguntas(59,4,"¿Te gusta cuidar a las personas enfermas?"));
    preguntas.add(new preguntas(60,4,"¿Te gustaría escribir alguna canción?"));
    preguntas.add(new preguntas(61,4,"¿Te gustaría realizar el balance general de alguna compañía?"));

    preguntas.add(new preguntas(62,4,"¿Te gustaría ser cantante profesional?"));
    preguntas.add(new preguntas(63,4,"¿Te gustaría ser contador?"));
    preguntas.add(new preguntas(64,4,"¿Qué tan bueno eres enseñando a otra persona sobre algún tema?"));
    preguntas.add(new preguntas(65,4,"¿Te gustaría realizar la mejor idea para alguna campaña publicitaria?"));
    preguntas.add(new preguntas(66,4,"¿La libertad y la justicia son valores fundamentales en tu vida?"));
    preguntas.add(new preguntas(67,4,"¿Entablas una relación casi personal con tu computadora?"));
    preguntas.add(new preguntas(68,4,"¿Te gustaría estudiar las enfermedades a través del microscopio?"));
    preguntas.add(new preguntas(69,4,"¿Lucharías por una causa justa?"));
    preguntas.add(new preguntas(70,4,"¿Mandarías tu curriculum a una empresa automotriz?"));
    preguntas.add(new preguntas(71,4,"¿Te atrae armar rompecabezas o puzzle?"));

    preguntas.add(new preguntas(72,4,"¿Pasarías horas leyendo algún libro de tu interés?"));
    preguntas.add(new preguntas(73,4,"¿Planificas detalladamente tus trabajos antes de empresa?"));
    preguntas.add(new preguntas(74,4,"¿Te gustan las revistas científicas relacionadas con la salud?"));
    preguntas.add(new preguntas(75,4,"¿Te gustaría trabajar con niños?"));
    preguntas.add(new preguntas(76,4,"¿Te gustaría aprender a reparar carros?"));
    preguntas.add(new preguntas(77,4,"¿Te ofrecerías para cuidar a un enfermo?"));
    preguntas.add(new preguntas(78,4,"¿Te gustaría organizar un con curso de atletismo?"));
    preguntas.add(new preguntas(79,4,"Cuando eliges o decoras tu casa ¿tienes en cuenta los colores, los estilos..?"));
    preguntas.add(new preguntas(80,4,"¿Te gustaría saber sobre la electricidad?"));
    preguntas.add(new preguntas(81,4,"¿Te gustaría viajar?"));

    preguntas.add(new preguntas(82,4,"¿Te gustaría conocer nuevos lugares?"));
    preguntas.add(new preguntas(83,4,"¿Te gustaría aprender otro idioma?"));



    return preguntas;
}

    public ArrayList<respuestas> returnRespuesta(){
        ArrayList<respuestas> respuestas=new ArrayList<>();
        //logica
        respuestas.add(new respuestas(1,1,"3",0));
        respuestas.add(new respuestas(2,1,"1", 1));
        respuestas.add(new respuestas(3,1,"4",0));
        respuestas.add(new respuestas(4,1,"5",0));

        respuestas.add(new respuestas(5,2,"un bus",0));
        respuestas.add(new respuestas(6,2,"una hora",1));
        respuestas.add(new respuestas(7,2,"un carro",0));
        respuestas.add(new respuestas(8,2,"no lo se",0));

        respuestas.add(new respuestas(9,3,"1",0));
        respuestas.add(new respuestas(10,3,"2",1));
        respuestas.add(new respuestas(11,3,"0",0));
        respuestas.add(new respuestas(12,3,"3",0));

        respuestas.add(new respuestas(13,4,"3",0));
        respuestas.add(new respuestas(14,4,"4",1));
        respuestas.add(new respuestas(15,4,"9",0));
        respuestas.add(new respuestas(16,4,"6",0));

        respuestas.add(new respuestas(17,5,"2",1));
        respuestas.add(new respuestas(18,5,"4",0));
        respuestas.add(new respuestas(19,5,"48",0));
        respuestas.add(new respuestas(20,5,"96",0));

        respuestas.add(new respuestas(21,6,"8",1));
        respuestas.add(new respuestas(22,6,"0",0));
        respuestas.add(new respuestas(23,6,"9",0));
        respuestas.add(new respuestas(24,6,"1",0));

        respuestas.add(new respuestas(25,7,"25",0));
        respuestas.add(new respuestas(26,7,"65",0));
        respuestas.add(new respuestas(27,7,"45",0));
        respuestas.add(new respuestas(28,7,"70",1));

        respuestas.add(new respuestas(29,8,"Son iguales",1));
        respuestas.add(new respuestas(30,8,"medio metro cuadrado",0));
        respuestas.add(new respuestas(31,8,"la mitad de medio metro",0));
        respuestas.add(new respuestas(32,8,"no lo se",0));

        respuestas.add(new respuestas(33,9,"El primero",0));
        respuestas.add(new respuestas(34,9,"El segundo",1));
        respuestas.add(new respuestas(35,9,"El tercer",0));
        respuestas.add(new respuestas(36,9,"El cuarto",0));

        respuestas.add(new respuestas(37,10,"6",0));
        respuestas.add(new respuestas(38,10,"12",0));
        respuestas.add(new respuestas(39,10,"24",0));
        respuestas.add(new respuestas(40,10,"60",1));

//matematicas
        respuestas.add(new respuestas(41,11,"50",1));
        respuestas.add(new respuestas(42,11,"45",0));
        respuestas.add(new respuestas(43,11,"30",0));
        respuestas.add(new respuestas(44,11,"10",0));

        respuestas.add(new respuestas(45,12,"10",1));
        respuestas.add(new respuestas(46,12,"20",0));
        respuestas.add(new respuestas(47,12,"25",0));
        respuestas.add(new respuestas(48,12,"50",0));

        respuestas.add(new respuestas(49,13,"10",0));
        respuestas.add(new respuestas(50,13,"24",1));
        respuestas.add(new respuestas(51,13,"12",0));
        respuestas.add(new respuestas(52,13,"7",0));

        respuestas.add(new respuestas(53,14,"10",1));
        respuestas.add(new respuestas(54,14,"22/3",0));
        respuestas.add(new respuestas(55,14,"6",0));
        respuestas.add(new respuestas(56,14,"14/3",0));

        respuestas.add(new respuestas(57,15,"64",0));
        respuestas.add(new respuestas(58,15,"-4",0));
        respuestas.add(new respuestas(59,15,"28",1));
        respuestas.add(new respuestas(60,15,"-16",0));

        respuestas.add(new respuestas(61,16,"42,345",0));
        respuestas.add(new respuestas(62,16,"43,234",0));
        respuestas.add(new respuestas(63,16,"44,429",0));
        respuestas.add(new respuestas(64,16,"45,452",1));

        respuestas.add(new respuestas(65,17,"3.1415",1));
        respuestas.add(new respuestas(66,17,"3.2132",0));
        respuestas.add(new respuestas(67,17,"3.3312",0));
        respuestas.add(new respuestas(68,17,"3.5523",0));

        respuestas.add(new respuestas(69,18,"56",1));
        respuestas.add(new respuestas(70,18,"60",0));
        respuestas.add(new respuestas(71,18,"65",0));
        respuestas.add(new respuestas(72,18,"45",0));

        respuestas.add(new respuestas(73,19,"12",0));
        respuestas.add(new respuestas(74,19,"32",0));
        respuestas.add(new respuestas(75,19,"6",0));
        respuestas.add(new respuestas(76,19,"24",1));

        respuestas.add(new respuestas(77,20,"4",0));
        respuestas.add(new respuestas(78,20,"6",1));
        respuestas.add(new respuestas(79,20,"3",0));
        respuestas.add(new respuestas(80,20,"8",0));

        //imagenes
        respuestas.add(new respuestas(81,21,String.valueOf(R.drawable.administracion),1));
        respuestas.add(new respuestas(82,21,String.valueOf(R.drawable.administracion2),1));
        respuestas.add(new respuestas(83,21,String.valueOf(R.drawable.cocina),1));
        respuestas.add(new respuestas(84,21,String.valueOf(R.drawable.cocina2),1));
        respuestas.add(new respuestas(85,21,String.valueOf(R.drawable.computacion),1));
        respuestas.add(new respuestas(86,21,String.valueOf(R.drawable.computacion2),1));
        respuestas.add(new respuestas(87,21,String.valueOf(R.drawable.construccion),1));
        respuestas.add(new respuestas(88,21,String.valueOf(R.drawable.construccion2),1));
        respuestas.add(new respuestas(89,21,String.valueOf(R.drawable.contador),1));
        respuestas.add(new respuestas(90,21,String.valueOf(R.drawable.contador2),1));
        respuestas.add(new respuestas(91,21,String.valueOf(R.drawable.digital),1));
        respuestas.add(new respuestas(92,21,String.valueOf(R.drawable.digital2),1));
        respuestas.add(new respuestas(93,21,String.valueOf(R.drawable.disenio),1));
        respuestas.add(new respuestas(94,21,String.valueOf(R.drawable.disenio2),1));
        respuestas.add(new respuestas(95,21,String.valueOf(R.drawable.electricidad),1));
        respuestas.add(new respuestas(96,21,String.valueOf(R.drawable.electricidad2),1));
        respuestas.add(new respuestas(97,21,String.valueOf(R.drawable.fisica),1));
        respuestas.add(new respuestas(98,21,String.valueOf(R.drawable.fisica2),1));
        respuestas.add(new respuestas(99,21,String.valueOf(R.drawable.juridica),1));
        respuestas.add(new respuestas(100,21,String.valueOf(R.drawable.juridica2),1));
        respuestas.add(new respuestas(101,21,String.valueOf(R.drawable.maestro),1));
        respuestas.add(new respuestas(102,21,String.valueOf(R.drawable.maestro2),1));
        respuestas.add(new respuestas(103,21,String.valueOf(R.drawable.mecanica),1));
        respuestas.add(new respuestas(104,21,String.valueOf(R.drawable.mecanica2),1));
        respuestas.add(new respuestas(105,21,String.valueOf(R.drawable.medicina),1));
        respuestas.add(new respuestas(106,21,String.valueOf(R.drawable.medicina2),1));
        respuestas.add(new respuestas(107,21,String.valueOf(R.drawable.musica),1));
        respuestas.add(new respuestas(108,21,String.valueOf(R.drawable.musica2),1));
        respuestas.add(new respuestas(109,21,String.valueOf(R.drawable.publicidad),1));
        respuestas.add(new respuestas(110,21,String.valueOf(R.drawable.publicidad2),1));
        respuestas.add(new respuestas(111,21,String.valueOf(R.drawable.secretaria),1));
        respuestas.add(new respuestas(112,21,String.valueOf(R.drawable.secretaria2),1));
        respuestas.add(new respuestas(113,21,String.valueOf(R.drawable.turismo),1));
        respuestas.add(new respuestas(114,21,String.valueOf(R.drawable.turismo2),1));
        respuestas.add(new respuestas(115,21,String.valueOf(R.drawable.computacion3),1));
        respuestas.add(new respuestas(116,21,String.valueOf(R.drawable.disenio3),1));

        //social

        respuestas.add(new respuestas(117,22,"siempre",3));
        respuestas.add(new respuestas(118,22,"casi siempre",2));
        respuestas.add(new respuestas(119,22,"talvez",1));
        respuestas.add(new respuestas(120,22,"para nada",0));

        respuestas.add(new respuestas(121,23,"siempre",3));
        respuestas.add(new respuestas(122,23,"casi siempre",1));
        respuestas.add(new respuestas(123,23,"nunca",0));

        respuestas.add(new respuestas(124,24,"si",3));
        respuestas.add(new respuestas(125,24,"casi siempre",2));
        respuestas.add(new respuestas(126,24,"aveces",1));
        respuestas.add(new respuestas(127,24,"no",0));

        respuestas.add(new respuestas(128,25,"si",3));
        respuestas.add(new respuestas(129,25,"no",0));

        respuestas.add(new respuestas(130,26,"si",3));
        respuestas.add(new respuestas(131,26,"no",0));

        respuestas.add(new respuestas(132,27,"si",0));
        respuestas.add(new respuestas(133,27,"no",3));

        respuestas.add(new respuestas(134,28,"1 al año",1));
        respuestas.add(new respuestas(135,28,"2 al año",2));
        respuestas.add(new respuestas(136,28,"4 al año",3));
        respuestas.add(new respuestas(137,28,"ningun libro",0));

        respuestas.add(new respuestas(138,29,"lo tomo",0));
        respuestas.add(new respuestas(139,29,"leo los prospectos",3));
        respuestas.add(new respuestas(140,29,"leo los efectos",2));

        respuestas.add(new respuestas(141,30,"9-10",3));
        respuestas.add(new respuestas(142,30,"7-8",2));
        respuestas.add(new respuestas(143,30,"3-6",1));
        respuestas.add(new respuestas(144,30,"1-3",0));

        respuestas.add(new respuestas(145,31,"si",3));
        respuestas.add(new respuestas(146,31,"no",0));

        respuestas.add(new respuestas(147,32,"si",3));
        respuestas.add(new respuestas(148,32,"no",0));

        respuestas.add(new respuestas(149,33,"interesante",3));
        respuestas.add(new respuestas(150,33,"impresionante",2));
        respuestas.add(new respuestas(151,33,"nada intersante",0));

        respuestas.add(new respuestas(152,34,"si",3));
        respuestas.add(new respuestas(153,34,"no",0));

        respuestas.add(new respuestas(154,35,"asustado",0));
        respuestas.add(new respuestas(155,35,"nervioso",1));
        respuestas.add(new respuestas(156,35,"contento",3));

        respuestas.add(new respuestas(157,36,"si",1));
        respuestas.add(new respuestas(158,36,"no",0));

        respuestas.add(new respuestas(159,37,"si",3));
        respuestas.add(new respuestas(160,37,"no",0));

        respuestas.add(new respuestas(161,38,"si",3));
        respuestas.add(new respuestas(162,38,"no",0));

        respuestas.add(new respuestas(163,39,"si",3));
        respuestas.add(new respuestas(164,39,"no",0));

        respuestas.add(new respuestas(165,40,"me gustaria conocer",3));
        respuestas.add(new respuestas(166,40,"no me interesa",0));

        respuestas.add(new respuestas(167,41,"si",3));
        respuestas.add(new respuestas(168,41,"no",0));

        respuestas.add(new respuestas(169,42,"si",3));
        respuestas.add(new respuestas(170,42,"no",0));

        respuestas.add(new respuestas(171,43,"si",3));
        respuestas.add(new respuestas(172,43,"no",0));

        respuestas.add(new respuestas(173,44,"si",3));
        respuestas.add(new respuestas(174,44,"no",0));

        respuestas.add(new respuestas(175,45,"si",3));
        respuestas.add(new respuestas(176,45,"no",0));

        respuestas.add(new respuestas(177,46,"si",3));
        respuestas.add(new respuestas(178,46,"no",0));

        respuestas.add(new respuestas(179,47,"siempre",3));
        respuestas.add(new respuestas(180,47,"casi siempre",2));
        respuestas.add(new respuestas(181,47,"nunca",0));

        respuestas.add(new respuestas(182,48,"repararlo",3));
        respuestas.add(new respuestas(183,48,"revisar que tiene",2));
        respuestas.add(new respuestas(184,48,"llevarlo a reparar",0));

        respuestas.add(new respuestas(185,49,"si",3));
        respuestas.add(new respuestas(186,49,"no",0));

        respuestas.add(new respuestas(187,50,"si",3));
        respuestas.add(new respuestas(189,50,"no",0));

        respuestas.add(new respuestas(190,51,"si",3));
        respuestas.add(new respuestas(191,51,"no",0));

        respuestas.add(new respuestas(192,52,"si",3));
        respuestas.add(new respuestas(193,52,"no",0));

        respuestas.add(new respuestas(194,53,"si",3));
        respuestas.add(new respuestas(195,53,"no",0));

        respuestas.add(new respuestas(196,54,"si",3));
        respuestas.add(new respuestas(197,54,"no",0));

        respuestas.add(new respuestas(198,55,"si",3));
        respuestas.add(new respuestas(199,55,"no",0));

        respuestas.add(new respuestas(200,56,"si",3));
        respuestas.add(new respuestas(201,56,"no",0));

        respuestas.add(new respuestas(202,57,"si",3));
        respuestas.add(new respuestas(203,57,"no",0));

        respuestas.add(new respuestas(204,58,"si",3));
        respuestas.add(new respuestas(205,58,"no",0));

        respuestas.add(new respuestas(206,59,"si",3));
        respuestas.add(new respuestas(207,59,"no",0));

        respuestas.add(new respuestas(208,60,"si",3));
        respuestas.add(new respuestas(209,60,"no",0));

        respuestas.add(new respuestas(210,61,"si",3));
        respuestas.add(new respuestas(211,61,"no",0));

        respuestas.add(new respuestas(212,62,"si",3));
        respuestas.add(new respuestas(213,62,"no",0));

        respuestas.add(new respuestas(214,63,"si",3));
        respuestas.add(new respuestas(215,63,"no",0));

        respuestas.add(new respuestas(216,64,"si",3));
        respuestas.add(new respuestas(217,64,"no",0));

        respuestas.add(new respuestas(218,65,"si",3));
        respuestas.add(new respuestas(219,65,"no",0));

        respuestas.add(new respuestas(220,66,"si",3));
        respuestas.add(new respuestas(221,66,"no",0));

        respuestas.add(new respuestas(222,67,"si",3));
        respuestas.add(new respuestas(223,67,"no",0));

        respuestas.add(new respuestas(224,68,"si",3));
        respuestas.add(new respuestas(225,68,"no",0));

        respuestas.add(new respuestas(226,69,"si",3));
        respuestas.add(new respuestas(227,69,"no",0));

        respuestas.add(new respuestas(228,70,"si",3));
        respuestas.add(new respuestas(229,70,"no",0));

        respuestas.add(new respuestas(230,71,"si",3));
        respuestas.add(new respuestas(231,71,"no",0));

        respuestas.add(new respuestas(232,72,"si",3));
        respuestas.add(new respuestas(233,72,"no",0));

        respuestas.add(new respuestas(234,73,"si",3));
        respuestas.add(new respuestas(235,73,"no",0));

        respuestas.add(new respuestas(236,74,"si",3));
        respuestas.add(new respuestas(237,74,"no",0));

        respuestas.add(new respuestas(238,75,"si",3));
        respuestas.add(new respuestas(239,75,"no",0));

        respuestas.add(new respuestas(240,76,"si",3));
        respuestas.add(new respuestas(241,76,"no",0));

        respuestas.add(new respuestas(242,77,"si",3));
        respuestas.add(new respuestas(243,77,"no",0));

        respuestas.add(new respuestas(244,78,"si",3));
        respuestas.add(new respuestas(245,78,"no",0));

        respuestas.add(new respuestas(246,79,"si",3));
        respuestas.add(new respuestas(247,79,"no",0));

        respuestas.add(new respuestas(248,80,"si",3));
        respuestas.add(new respuestas(249,80,"no",0));

        respuestas.add(new respuestas(250,81,"si",3));
        respuestas.add(new respuestas(251,81,"no",0));

        respuestas.add(new respuestas(252,82,"si",3));
        respuestas.add(new respuestas(253,82,"no",0));

        respuestas.add(new respuestas(254,83,"si",3));
        respuestas.add(new respuestas(255,83,"no",0));
        return  respuestas;
    }


    public ArrayList<resultados> returnResultado(){
        ArrayList<resultados> resul=new ArrayList<>();
        resul.add(new resultados(1,1,0,0,0,0,0));
        resul.add(new resultados(2,2,0,0,0,0,0));
        resul.add(new resultados(3,3,0,0,0,0,0));
        resul.add(new resultados(4,4,0,0,0,0,0));
        resul.add(new resultados(5,5,0,0,0,0,0));
        resul.add(new resultados(6,6,0,0,0,0,0));
        resul.add(new resultados(7,7,0,0,0,0,0));
        resul.add(new resultados(8,8,0,0,0,0,0));
        resul.add(new resultados(9,9,0,0,0,0,0));
        resul.add(new resultados(10,10,0,0,0,0,0));
        resul.add(new resultados(11,11,0,0,0,0,0));
        resul.add(new resultados(12,12,0,0,0,0,0));
        resul.add(new resultados(13,13,0,0,0,0,0));
        resul.add(new resultados(14,14,0,0,0,0,0));
        resul.add(new resultados(15,15,0,0,0,0,0));
        resul.add(new resultados(16,16,0,0,0,0,0));
        resul.add(new resultados(17,17,0,0,0,0,0));

        return resul;
    }
}
