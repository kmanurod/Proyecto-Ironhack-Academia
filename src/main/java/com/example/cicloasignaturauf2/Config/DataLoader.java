package com.example.cicloasignaturauf2.Config;

import com.example.cicloasignaturauf2.Entity.Ciclo;
import com.example.cicloasignaturauf2.Entity.Asignatura;
import com.example.cicloasignaturauf2.Entity.UnidadFormativa;
import com.example.cicloasignaturauf2.Repository.CicloRepository;
import com.example.cicloasignaturauf2.Repository.AsignaturaRepository;
import com.example.cicloasignaturauf2.Repository.UnidadFormativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private CicloRepository cicloRepository;

    @Autowired
    private AsignaturaRepository asignaturaRepository;

    @Autowired
    private UnidadFormativaRepository unidadFormativaRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        // Crear y guardar ciclos
        Ciclo ciclo1 = new Ciclo();
        ciclo1.setCodCiclo("1111");
        ciclo1.setAbrCiclo("DAW");
        ciclo1.setNomCiclo("DespliegueAplicacionesWeb");

        Ciclo ciclo2 = new Ciclo();
        ciclo2.setCodCiclo("2222");
        ciclo2.setAbrCiclo("DAM");
        ciclo2.setNomCiclo("DespliegueAplicacionesMovil");

        cicloRepository.saveAll(Arrays.asList(ciclo1, ciclo2));

        // Crear y guardar asignaturas
        Asignatura asig1 = new Asignatura();
        asig1.setCodAsig("xxxx");
        asig1.setNomAsig("BBDD");
        asig1.setPrecioAsig(200.0);
        asig1.setCiclo(ciclo1);

        Asignatura asig2 = new Asignatura();
        asig2.setCodAsig("xxxy");
        asig2.setNomAsig("CODING");
        asig2.setPrecioAsig(300.0);
        asig2.setCiclo(ciclo1);

        Asignatura asig3 = new Asignatura();
        asig3.setCodAsig("zzzz");
        asig3.setNomAsig("ANDROID");
        asig3.setPrecioAsig(150.0);
        asig3.setCiclo(ciclo2);

        Asignatura asig4 = new Asignatura();
        asig4.setCodAsig("zzzy");
        asig4.setNomAsig("IOS");
        asig4.setPrecioAsig(230.0);
        asig4.setCiclo(ciclo2);

        asignaturaRepository.saveAll(Arrays.asList(asig1, asig2, asig3, asig4));

        // Crear y guardar unidades formativas
        UnidadFormativa uf1 = new UnidadFormativa();
        uf1.setCodUF("xxxxUF1");
        uf1.setNomUF("BBDD UF1");
        uf1.setHorasUF(20);
        uf1.setAsignatura(asig1);
        uf1.setCiclo(ciclo1);

        UnidadFormativa uf2 = new UnidadFormativa();
        uf2.setCodUF("xxxxUF2");
        uf2.setNomUF("BBDD UF2");
        uf2.setHorasUF(25);
        uf2.setAsignatura(asig1);
        uf2.setCiclo(ciclo1);

        UnidadFormativa uf3 = new UnidadFormativa();
        uf3.setCodUF("xxxyUF1");
        uf3.setNomUF("CODING UF1");
        uf3.setHorasUF(40);
        uf3.setAsignatura(asig2);
        uf3.setCiclo(ciclo1);

        UnidadFormativa uf4 = new UnidadFormativa();
        uf4.setCodUF("xxxyUF2");
        uf4.setNomUF("CODING UF2");
        uf4.setHorasUF(50);
        uf4.setAsignatura(asig2);
        uf4.setCiclo(ciclo1);

        UnidadFormativa uf5 = new UnidadFormativa();
        uf5.setCodUF("zzzzUF1");
        uf5.setNomUF("ANDROID UF1");
        uf5.setHorasUF(30);
        uf5.setAsignatura(asig3);
        uf5.setCiclo(ciclo2);

        UnidadFormativa uf6 = new UnidadFormativa();
        uf6.setCodUF("zzzzUF2");
        uf6.setNomUF("ANDROID UF2");
        uf6.setHorasUF(60);
        uf6.setAsignatura(asig3);
        uf6.setCiclo(ciclo2);

        UnidadFormativa uf7 = new UnidadFormativa();
        uf7.setCodUF("zzzyUF1");
        uf7.setNomUF("IOS UF1");
        uf7.setHorasUF(45);
        uf7.setAsignatura(asig4);
        uf7.setCiclo(ciclo2);

        UnidadFormativa uf8 = new UnidadFormativa();
        uf8.setCodUF("zzzyUF2");
        uf8.setNomUF("IOS UF2");
        uf8.setHorasUF(65);
        uf8.setAsignatura(asig4);
        uf8.setCiclo(ciclo2);

        unidadFormativaRepository.saveAll(Arrays.asList(uf1, uf2, uf3, uf4, uf5, uf6, uf7, uf8));
    }
}