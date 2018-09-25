package etnolengua.diccionario;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;


public class Traductor extends AppCompatActivity {
    EditText ETtrad;
    Button btnTrad;
    TextView texttrad;
    Button traducir;
    VideoView Vid;
    String esp[]={"¿Qué?","alabuena","alamedida","alaorilla","aoscuras","avista","abajo","abajo","abajo","abierto","abismo/lugardifícil","abrázalo","abrelaboca","abrircaminoconmachete","abuela","abuelo","abuelo","abunda","aburrirse","acarrear","acéptalo","achiote","acuerdate","acuéstalo","adelántate","adelántate","adentro","adulto","afeminado","agarralo","agua","aguacaliente","aguacate","aguacatesilvestre","águila","ahí","ahora/enestostiempos/comohoy/actualmente","ajo","ajustado","ala","alacrán","albañil","albañil","algodón","algunos","alineado/escarbado","allá","alma","almohada","almuerzo","alto","alumbra/calordelfuego","alumbrar","amargo","amarrado","amarrar","ambicioso","amolado","anastasia","anchura","anciano/viejo/abuelo","anotado","anteayer","antepasados","aparte","apenas","aplastada","aplauso","aprende","apréndelo","aprendiendo","aprendiendo","apurarlo","aquel","aquel","araña","árbol","arcoiris","arde/encendido","ardilla","arena","arena","armadillo","arrestado","arriba","arroba","ásalo","asamblea","asesino","así","asómate","atajar","atornillado","atrás","atrás","atrevido","Aurora(nombre)","autoridad","avecindado","avisado","avispa","ayer","ayudarle","babea","baila","bailando","bailar","baja","banco","bañando","báñate","barato","barato","barbacanosa","barriendo","barriga","barrigon","barro","bastante","bastante","bastón","baúl","bebé/criatura/infante","bejuco","bendecido","bestia","blanco","boa(vivora)/venado","boca","boca","bocagorda","bocaroja","bocasucia","bonita","bordado","borracho/borracha","bravo","brazofuerte(animal)","brinca","burlado","buscalo","buscarlo","caballo","cabaña","cabello","cabeza","cabezón","cachete","cadena/torzal/collar","cadera","cal","calabaza","calculado","caldo","caliente","cállate","calzada","cama","caminaragarradosdelamano","camino","camino/vereda","camisa","camote","canción/melodía","cangrejo","canica","canoso","cansado/cansada","canta","cantando","cántaro","cárcel","carga","cárgalo","cargando","cargar","caro","casa","casamunicipal","casamientoenelmunicipio","cásate/tomalo","cascada","castellanizado","cazador","cedro","celoso/celosa","ceniza","cerdo/puerco/marrano/choncho","cerebro","cerrado","cerrado","cerrado","cerrarcontirademadera","cerro","chacal","chamaco","chamarra","chango(animal)","chapulín","chayote","chico","chile","chilero","chueco","chueco","chupalo","cielo","cien","cigarro","cincel","cinco","cintura","ciruela","clara/transparente","cocido","coco","codo","coincide","colado","colgado","comadre","comadre","comadreja","come/comida","cómelo","comiendoencaseajena","comió","comióenelcamino","cómo","como(adverbio)","completo","compra","compra/venta/comerciante","cómpralo","conenojo","conesfuerzo","conducho","confesado","conocedor","conocerse","contento","contesta","copal","corredor","corrió/voló","cortado/rasurado","córtalo","córtalo/tortuga/viejo/usado","cortarconcuchillo","corto","cosaalargada","cosacorta","cosecha","cosecharcafé","costilla","costuraralgunacosa","coyol","crecimientorápidodeunapersona","cristalina","cruzaelrío","cuánto","cuatro","cucaracha","cuchara","cuchillo","cuernodeanimal","cuerpo","culebra","culo","culpa","cuñada","cuñada","cuñado","dale","dandovuelta","daño","dememoria","depicoamarillo","dedo","dejado(telas)","delmismopueblo","delotrolado","delgado","delicado","demonio","derecho","derrumbar","desatado","descalzo","descansa","descompuesto","descuarizar","desdeentonces","desgracia,accidente","desminuyendo","desnudarse","desnudo/encuerado","despierta","desprecia","desprecio","despulpa","destapado","destinado","desyerbado","deuda","diablo","diente","dieza","diferente","difícil","dile","dinamita","dinero","dinero","dinero(capital/crédito)","disgustado","doblar","doblarropa","dolordecabeza","dónde/donde","dos","duele","dueño","duerme","duerme/durmiendo","duérmete","dulce/panela","dura","durable","duro","duró","echaralgunacosaconlamano","educado","ellos","embarazada","empezando","enelmunicipio","enlamilpa","enpareja/dedosendos","ensilencio","encargar/ordenar","encuentralo","endredón","enemigo","enfermedad","enmascarado","enojado","enrolla","entero/entera","enterrado","entrediez","entretodos","entrevarios","entrevarios","envíalo","envolver","envuelto","envuelvelo","epazote","escalera","escandaliza","escoba","escopeta","escuela","espalda","espejo","espera","espera","espera","espero/turbio","espina","espíritu/alma","estácomiendo","estásucediendo","estaca","estarcargando","estarenfermo","este","estrecho","estrella","estudiando","evaporando","excremento","expertosobrelalecturadelcalendarioMixe","fabricado/hecho","falda","faltapoco","favor","filoso","flojo/holgazán","flor","fresco","frío","fuego/lumbre","fuerza","gallina","gancho","gavilán","gemelo","gente","genteborracha/borrachos","gentebuena","Gilberto/Virgilio/Guillermo","golpearconelpuño","gordo","grande","granizo","grano","granosenlaboca","grasa/manteca","grillo","grita","grueso","guajolote","guapino(árbol)","guardado","guardalo","guayaba","hablar","hacefalta/esnecesario","hacerato","haceradobe/fabricarladrillo","hacercalor","hacerpedazosalgunacosaconunmachete","hacha","hamaca","hambriento","hembra","herida","herida","heridaenlaboca","hermanomayordelamujer","herramienta","hierbabuena","hígado","higo","higuerilla","hija","hijonatural","hilo","hincado","hinchado","hipo","hoja","hojadeocote","hombro","hombro","hondo","hondo/lleno","hormiga(arriera)","hormigón","hoy","hoy","hueco/agujero","hueledenoche","hueso","huesodecostilla","huesoderodilla","huevo","huevo","hule","iglesia","iguana","imitar","insiste","intencionalmente","intestino","irritalaboca","jícara","jícaraparaservircaldo","jonote(árbol)","juego","juez","juguete","Julio(nombreomes)","juntos","labios","labrado","ladrillo/adobe","ladrón","lagartija","lasúltimas","lava","lejos","lengua","leña","levántalo","levantarse","limite","listón","llave","llega","lleno/satisfechodecomida/saseado","llora","llora(imperativo)","llorona","llovizna","llueve","lluvia","lodispararon","lomandaron","lomismo","loco","lodo","loma/trabaja","lucerodelamañana","luego","lugarparabañarse","lugar/tiempo","luna/mesdelaño","machete/fiero","madre","madrina","maduro","maduro/plátano","maíz","maízdesgranado","maíztierno","maíz/cafélavado","mala/sucia","malva","malva(yerba)","mamey","manda","mandato/orden","mano","manojos","manso","mañana","mapache","mar","marrano","marta","másallá","masa","mazacuala(culebra)","mázate(animal)","meiré","meretiro","mecapal","medicina","medido","mediodía","melenudo","mentiroso/mentirosa","mesa","mesa","metate","mezquino","mídelo","milpa","mira","miraelcamino","mitad","mixe(lengua)","mojara","molido","mosca","muchacha","muerto","mugre","mujer","murciélago","nadie","nalga/gluteo/trasero/pompa","nalga/gluteo/trasero/pompa","nanacastle(árbol)","nanche","naranja","nariz","natalia","neblina","negro","nido/animallanudo","niña","niño/chamaco","no","No","nohaynadie","nombredeunárbol","nombredeunárbol","nombredeuncerro","nopal","nosotros","novio","nube/humo","nudo","nueve","nuevo","nutria","obo","obo(árbol)","ochenta","ocho","ocote(árbol)","ofrecido","oído","olla","olvidar","ombligo","oreja","originario/aborigen","orina","otoño","otravez","oye","padre","padrino","pagado","paisano","pájaro","pájaro","pala","palma","palo","paloma","pan","pantalón","pañal/envuelvelo","pañuelo","papa","papel","pareddebarro","parir/pariendo","partesdelgadasdelcuerpo","partirunacosa","pásale","pasarlamano","pasó","patea","patio","pecho","pedacería","pedazo","pedirposada","pegado","pégalo","pegamento","pegar","peine","pelado","pélalo","peleando","pelón","pelón","peluquero","perdido","perdón","periododetrásdías","personaajena","personaplaticadora","pesado","pescado/pez","pestilencia(cuerpodescompuesto)","petate","pezón","pideprestado","pie","piedra","piedracaliente","piel/corteza","pierna","pintado","piña","piojo","plano","plátano","plato","pobre","pobre","podrido","porejemplo","poreso","porfuera","porlafuerza","porsupropiavoluntad","porque","posada","posible","preciso","preso","prestado/prestada","primero","pronto","pronto","pueblo","puercoespín","puerta","pujando","pulga","pulque","pus","queduele","quegermina","quebrado","quemado","quien","quiensabe","quierever","quiérelo","quijada","quitaralgo","rápido","rasurado","raya","reboso","recelentar","recíbelo","recipiente","recto","recto/cierto","rédito","reflejo","regálalo","remendado","resbaloso","resguño","reventó","revienta","revive","rico","rincón","ríogrande","risueño","robado","rodando","rodilla","rodó","rojo","ronca","roñoso","roto","roto","sabio","sácalo","sal","salado","salario","saliva","salte","sangra","sangre","sapo","sazón","sé","seabrió","seacaba","seacabó","seagarraron","seagujereo","seahoga","seahogó","secayó","secayó(persona)","sedobla","sedobla","sehacelodo","seirá","sequeja/puja","sereproduce","sesube","setrabó/seatoró","seva","sevacomponer","seve","seviene","seco","secretaria","seis","sellado","selva,montaña","sembradio","sembrado","sembró/siembra","semilla","semilladecalabaza","señorita","serete","serrucho","servilleta","servirlacomida","sesenta","seso","sí","síembralo","siempre","siete","siguereventando","sinbarba","sindiente","sindulce","sintomaragua/asecas","sinvoluntad","soldadodesoldar","solo","sombra","sombrero","sonó","soñando","sordo/travieso","sucomida","súbete","subida","sucedió","suegro","suéltalo","sueño","sufre","sufrimiento","suplente","suspira","suya","tabla/banco","talón","tamal","tamal","tamalblancoconsal","tambo","tapado","tapado","tápalo","tápalo","taparalgo","taparconpalos","tardado","tartamudeando","taza","tecolote","tecolote","tejido","tejón","temprano/demañana","tenercalor","tepijilote","terrenoparacasa","testículo","tienehipo","tieneprecio","tierra","tigre","tijera","tiralo(frutas)","tiralo","tíralo","tíraloabaji","tirargranos/cerealesoarenaconlamano","tlacuache","tlacuache","tocandolaguitarra","todavíano","todo","todo","tomate","tortilla","tortillacaliente","tortillaconsal","tosferina","tos/regaño","totalmentelleno","totomosle","trabajarenfermo","trabajo/cargo","trágalo","tres","triste","troje","trozado","trueno","tú","tumamá","tupapá","tucán","tusa(animal)","undía","unpeso","uno","unoporuno","uña","usado","ustedes","utensiliodecocina","uva","vamonos","varón","varón","ve","vealo","veinte","ven","vena","venado","vendedor","véndelo","verdad","verdad/cierto","verde","vergüenza","vete","veté","viejo/gentegrande","viene","viento/aire","viñuela","violentamente","violín","vivo","vomito","vuelveasubir","ya","yerbamora","yerno","yo","yuca","zacate","zacate","zanate(ave)","zancudo","zorrillo","zurdo/zurda"};
    String mixe[]={"tii","aoy","mëtëyë","pa'ay","akoots","kumioo","apataayk","naaxyp","pataam","awa'ats","tsiptuuy","mënenj","awëëk","apux","ta'mam","apteety","tety'ap","najajtëp","tsipëëp","jatsem","kupëk","atsyuut","jaa'myets","ko'ok","jamë'k","nëkxëëk","tekoot","mëjay","atooxy","mats","nëë","annëë","kuutypy","tsinkuutyp","maxywiits","jii","jata'apë","antsyiuxk","ta'tspëky","kieky","ka'ky","muts'pë","pojtspë","pixy","nëjë'e","atajp","jim","anma","kukony","ajop","këxp","jajp","kutëëkx","ta'am","awëëny","awëën","atsojkp","ixtsyaatsy","tatsy","iook","ap","kujaay","maxteiky","aptejk","awiink","atsaatsy","nak","këpo'xp","jat","apëk","apëjkp","ixpejp","tsoke","jaaj","jue'e","pooxyp","kepy","i'intsy","toopy","kuuy","puu'j","tsapyu'u","nëëts","axwijtsë","kexp","aropë","tsa'aw","namiukee","jayaokpë","jatu'un","axwoots","axajtuk","kuwitëëy","axaam","ixaam","kupeit","Aurorë","kutunk","atsënapië","awënëy","joomy","axëëy","pupejtpë","awaay","ets","ejtsp","ajtsp","mënak","konyt","tsiip","tsiiw","kuka'ay","kumënaik","apoo","peetp","mox","moxtsaam","puj","amay","may","tajk","kaax","maxuunk","aats","kunuukx","jëyujk","poop","jatsyu'u","aaw","awak","atsaam","atsap'ts","akootsy","tsuj","pëjxuy","amuukyë","awa'an","tsinuuk","tëpx","nixiiki","ixta'w","axtaaw","kuaay","tse'ex","kuwaay","kupajk","kusaam","amaatsy","nantsëm","ixpajk","jaam","tsii","aixëëy","kanëë","an","amon","këë'k","këjk","nawyj'tsëp","tu'u","tëytyuu","kamiixy","muny","ëy","eets","kanikë","kupooj","anu'xëëpy","ëëw","ëëp","majt","pu'xiëxk","tseim","tseem","tsëëmp","këëw","tsowë","tëjk","akujtëjp","akujpëjp","pëk","tax","amëxan","pëkpë","aj","amutsk","kujyam","kutsy","kukooxy","ajiitsy","akëy","atuky","apax","kop","tsaxy","mixenk","nijen","mi'ka","mu'u","akxa","mutsk","niiy","aniiy","aney","key","muujk","tsajp","moko'px","juu'k","pa'ant","mëkooxk","tiinky","tuuny","të'kxy","këë'w","tsajkum","këkox","napiatëp","anaxy","kutëy","kuaan","tajkuaan","iixy","kay","jëë'x","mëkaapy","kaaxy","tukaay","nej","nejpy","ka'pxy","juupy","ajuupyë","juy","amaat","nimajaa","tujtpaak","mayats","jajpëjia'ay","nayixyatep","jootkuik","atsow","poom","tejkwiin","keek","kepy","tsuk","tuk","axtsuk","kon","ayoony","akon","tsijkp","piip","katsy","axuy","kum","axyeek","tëxy","nëënax","naak","mëtaaxk","amuutsy","kutsyarë","tsujt","kapk","nini'kx","tsa'any","kuuts","pojkpë","kapy","ojy","jëy","mo'ow","awëtijp","katyeey","akupajp","apu'ts","këwa'ax","ixmatsy","mëkukajp","awiim","pejy","amaay","kaoypia","teye","jits","kejy","teikwaats","pokx","maat","e'ek","jajty","ayoony","aweenëëy'py","jen","axwa'ats","mayuik","pej'xp","apejkp","jet","kuwa'ats","nipetakëey","mootsy","nukxy","mëjkuu","tëëts","majk","tekatsy","tsip","nëma'a","nëtujt","meeny","men","menkiop","ejkëp","ots","ane'ek","kupoj","maa","metsk","pa'amp","nijaay","maaj","maap","maaw","pa'ak","ijp","jejp","juuny","jejk","awokëëw","axpëky","ajkxy","jaaotyp","tsontaakp","akujk","kamjoit","ametsk","ametsy","aneem","paat","axuk","mëtsip","pa'am","aptoot","jotma'p","pit","amuum","tajë'y","nëmajk","nikëxy","nëmaay","nëmay","kex","amots","motsy","nëmots","puteeit","teeny","amayeepy","peetk","tuktk","kapxoyëyë","jëëxk","ijty","aix","awix","jaix","ki'xk","apty","jewe'ny","kaapy","jajtëp","kup","tëëmp","pëkëp","ata","axuuts","mëtsaa","ixpeky","ajojp","të'ëny","kuxëë","kojy","ëxuk","jaween","mayajt","jëjp","nuux","pëjy","nik","tëtsy","jëën","majaa","tseey","jo'k","kuwaj","axeeny","ja'ay","amukiëjaay","oyjaay","jil","tex","nik'xe","mëj","tëtstuu","puuts","apuuts","on","tsiktsy","ayaaxp","mapxy","tuut","akpejy","pekeiky","pëkë'ëk","pox","kapk","mayjajp","aamy","muuts","anpëkp","apuxëëw","jaatsye","tsaay","kax","to'oxy","jot","tsëtsyë","ajot","ay","tumpejt","tsajpnëmaank","joot","piits","tsajptsooy","toxyuunk","akony","piity","kojxtënaa","kixp","nëjëë","aay","tsinaay","kejkyopk","keky","këëk","kom","nuj","akooy","jata'a","kyam","jut","matap","pajk","katsypajk","koxkopk","tuuty","tsetyuuty","oomy","tsajtëjk","tutsëj","amaapy","mëmëkta'ak","najoot","tiintsy","axiik","tsim","jee'p","pa'ants","ëyëë","konk","iik","julië","muiky","ateem","tsetsy","muutsy","metspë","tik","jakoyë","puj","jakuem","toots","ja'aw","konë'ëk","pëtëëk","tsepaant","kuu't","awaats","ja'p","kuxyë","jëëpy","jë'ëw","ayaaxy","tsatyuu","tuup","tuu","tujë","kejkë","janëyë","kuiin","moonts","tun","jaxyëëm","jatyi","tsitaak","it","po'o","pujx","taj","otiaj","otsyam","tsa'am","mook","mokëkxy","nikmook","maaky","axëëm","kaaxy","tamujts","potkaak","ana'amp","kutujt","kë'ë","apity","maax","japoom","nëyaay","mejy","atsëm","kexytsyik","nijim","jëtsy","puk","pax","atakampëtsy","jewa'k","tsëmtsaay","tsooy","kipxy","kujxyëë","kupeeny","anëë","kapiejt","meexë","paan","tsipty","kipx","kam","eep","tuijxp","kupk","ayuk","tsaam","me'ey","niix","kiix","o'kpë","puu'ty","toxyëjk","tëëxy","nipën","axpajk","ixmaatsy","nëëky","tux","tsuiik","jëput","tay","nëma","tsixy","pe'eny","kixyunk","pina'k","kaj","ka'p","apak","atsyaam","tsëëny","apkop","taat","ëtsyatëm","jamië'ët","jok","poox","taaxtujk","jemy","nëkaa","maxy","pikxmaxy","mëtajpx","tuktuujk","tsiin","aweenëëy","taatsk","tu'ts","jatyëkoy","puutsk","taatsak","kunaax","ta'ats","poot","jataook","mëtow","teety","tetykuaan","kujuy","mëkunaax","axkakak","joon","pu'xyuun","jow","kepy","muuxy","tsakeekt","ixyë","mots","payë","tsaj'muny","naiky","potsy","ke'exp","apiiny","ajetee","nax","ajaax","majx","nejp","tëpaa","katsyak","tsay","tu'teik","ayoopy","ootsy","ton","otsk","kox","kaxk","tak","jep","tsiptuump","kutajt","kutë'ëx","me'xpë","tëkojy","mekx","maaxk","tekëjaay","akapx","jemtsy","akx","tikts","to'oky","tsiits","anu'xp","teiky","tsaa","antsaa","ak","puuy","kats","tsikty","aat","jooy","ka'ak","texy","ayoop","ëyoop","pu'uts","axtaamëts","paaty","ajëëxk","atsip","atmsoo","jatits","amejtstaakp","mapaat","mëktaaik","tsuim","anukx","jawiin","pakyë","tsojk","ka'p","aptykaa","tëjk'akë","ajëjp","pix","keetsy","komy","atoom","mujxp","pu'u","no'oki","pën","panejtyë","ixaam","tsok","apajk","ajaxtu'ut","tsooky","kume'exy","keets","kuwëën","ajokxëëw","kontsow","apëkëny","kujk","tëy","menyunk","ajajp","niyeki","axuyëy","nokts","tsekxy","pojt","pot","juikypëjp","mayë","atsikx","mëjnëë","axiik","meetsy","pik","kox","kuna'x","tsapts","tok'xp","jëk","këëts","tëj","maapie","juut","kaan","taamts","mëjuny","tsujjy","pëtsem","taj'xp","ne'py","puun","maj","jajpëtsy","awaats","këjxp","këjk","nimyajtsë","jujt","ji'kxp","ji'xy","ka'w","këtaw","aojtsp","neepy","amoontsëëpy","ataakamp","ëjëjp","mayiipy","pejp","je'x","nëkxp","oyëwamp","kaxje'kp","majtsp","të'ëts","ja'apyë","tutujk","aootsy","itkujk","kamtëjk","kojy","niip","tëëm","tsipajk","këxyii","kejki","jëtk","kaakmiots","apëkëëw","tuwë'px","ko'oxy","jaantsy","koj","itëm","juxtujk","jakpot","atak","atuk","tsek'tsy","akutë'ëts","nëkoopë","atsayee","natiuuk","aapk","kujup","nojk","kumaap","nat","jyek'exy","këxpet","kexwin","jaj'te","tsuap","axmats","kumaa","ëyoop","axtsaatsy","namëj","mëkxë'p","jya'a","pu'uy","tekixpok","më'ëky","panuuky","taamtsmë'ëky","tampë","atsiitsy","nipeeny","ajup","kuwits","ajiits","akap","jejky","anaakp","tasë","ju'k","kujx","taaik","tsik","jopy","ano'këpëtsy","nuun","tëjkop","tutsyaa","nëjëp","tsopaatp","naax","kaa","me'px","ixcaats","ka'ats","axkaats","kuka'tsnax","axwë'j","mokx","poo","koop","ka'në","kësyë","kexyë","ko'on","kaaky","amkaaky","taamtskaaky","ji'xoj","oj","apëëtsy","akts","apaam","tuunk","jëën","tuwëëk","ta'mape","tsex","pooty","anee","miitsy","mtaj","mteety","kaat","tëptsy","tuk'xëë","peexy","tu'uk","atu'ukaty","këxooky","pak","miitsyajkx","pok","tsaatypy","jam","jexy","mixy","ijxp","ix","ipx","min","eemy","naan","tokpë","took","tëmts","teyajt","pu'ts","tsotiuun","nëkx","ataak","amëj","mimp","poj","mëxampuuts","atsipamaat","jëtk","juiky","ëëtsy","jakpet","tëë","mujtyaay","më'ët","ëëtsy","kupixy","mëëy","nektsy","piijx","pëëx","paats","ana'jty"};
    int index;
    int puchado=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traductor);

         ETtrad=findViewById(R.id.editText3);
         btnTrad=findViewById(R.id.ButTrad);
        texttrad=findViewById(R.id.texttrad);
        traducir=findViewById(R.id.buttontrad);
        Vid=findViewById(R.id.videoView3);
        traducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (puchado==0) {
                    AudioManager audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                    audio.adjustStreamVolume(AudioManager.STREAM_MUSIC,
                            AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI);
                    puchado++;
                }else if(puchado==1) {
                    Toast.makeText(getApplicationContext(),"Recuerda subir el volumen para escuchar la pronunciacion",Toast.LENGTH_LONG).show();
                    puchado++;
                    }try{
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(ETtrad.getWindowToken(), 0);
                }
                catch (NullPointerException exception) {
                    Toast toast = Toast.makeText(getApplicationContext(),"se ha producido un error,\n lo sentimos :(",Toast                     .LENGTH_LONG);
                }
                recorre();
                Video();
            }
        });
        ETtrad.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                    //do what you want on the press of 'done'
                    if (puchado==0) {
                        AudioManager audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                        audio.adjustStreamVolume(AudioManager.STREAM_MUSIC,
                                AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI);
                        puchado++;
                    }else if(puchado==1) {
                        Toast.makeText(getApplicationContext(),"Recuerda subir el volumen para escuchar la pronunciacion",Toast.LENGTH_LONG).show();
                        puchado++;
                    }try{
                        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(ETtrad.getWindowToken(), 0);
                    }
                    catch (NullPointerException exception) {
                        Toast toast = Toast.makeText(getApplicationContext(),"se ha producido un error,\n lo sentimos :(",Toast                     .LENGTH_LONG);
                    }
                    recorre();
                    Video();


                }
                return false;
            }
        });
     }
    public void recorre(){
        boolean band =false;
        String tring = ETtrad.getText().toString();
        tring=tring.toLowerCase();
        for(int i=0;i<esp.length;i++){
            if(tring.equals(esp[i])) {
                index= i;
                band=true;
                break;
            }
        }
            if(!band) {
                Toast toast = Toast.makeText(getApplicationContext(),"La palabra '"+tring+"' no se encuentra",Toast.LENGTH_LONG);
                toast.show();
            }
            else if(band){
                texttrad.setText(mixe[index]);
            }
    }
    public void Video(){
        boolean band ;
        band= true;
        String fileplace="android.resource://" + getPackageName() + "/raw/";
        String A = ETtrad.getText().toString().toLowerCase();
        if (A.equals("uno")  || A.equals("UNO")) {
            String filename="uno";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));

            Vid.start();
            band=false;
        }
        if(A.equals("dos") || A.equals("DOS")) {
            String filename="dos";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            band=false;
        }
        else{
            if(band) {
                Toast toast = Toast.makeText(getApplicationContext(), "la pronunciación de '" + A + "' aun no se encuentra disponible", Toast.LENGTH_LONG);
                toast.show();
            }
        }
    }
}


