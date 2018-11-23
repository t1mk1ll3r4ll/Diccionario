package etnolengua.diccionario;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;


public class Traductor extends AppCompatActivity {
    EditText ETtrad;
    TextView texttrad, pronun;
    Button traducir;
    VideoView Vid;

    String esp[]={"abajo", "abierto", "abismo", "abrázalo", "abuela", "abuelo", "abunda", "aburrirse", "acarrear","accidente", "acéptalo", "achiote","actualmente", "acuerdate", "acuéstalo", "adelántate", "adentro", "adulto", "afeminado", "agarralo", "agua", "agua caliente", "aguacate", "aguacate silvestre", "águila", "ahí", "ahora", "ajo", "ajustado", "ala", "alacrán", "albañil", "algodón", "algunos", "alineado", "allá", "alma", "almohada", "almuerzo", "alto", "alumbra", "alumbrar", "amargo", "amarrado", "amarrar", "ambicioso", "amolado", "anastasia", "anchura", "anciano", "anotado", "anteayer", "antepasados", "aparte", "apenas", "aplastada", "aplauso", "aprende", "apréndelo", "aprendiendo", "aprendiendo", "apurarlo", "aquel", "aquel", "araña", "árbol", "arcoiris", "arde", "ardilla", "arena", "armadillo", "arrestado", "arriba", "arroba", "ásalo", "asamblea", "asesino", "así", "asómate", "atajar", "atornillado", "atrás", "atrás", "atrevido", "aurora", "autoridad", "avecindado", "avisado", "avispa", "ayer","ayudarle","a la buena", "a la medida", "a la orilla", "a oscuras", "a vista", "abre la boca", "abrir camino con machete", "babea", "baila", "bailando", "bailar", "baja", "banco", "bañando", "báñate", "barato", "barato", "barba canosa", "barriendo", "barriga", "barrigon", "barro", "bastante", "bastante", "bastón", "baúl", "bebé", "criatura", "infante", "bejuco", "bendecido", "bestia", "blanco", "boa", "venado", "boca", "boca", "boca gorda", "boca roja", "boca sucia", "bonita", "bordado", "borracho", "borracha", "bravo", "brazo fuerte", "brinca", "burlado", "buscalo", "buscarlo","caballo", "cabaña", "cabello", "cabeza", "cabezón", "cachete", "cadena", "cadera", "cal", "calabaza", "calculado", "caldo", "caliente", "cállate", "calor del fuego", "calzada", "cama", "camino", "camino", "camisa", "camote", "canción", "cangrejo", "canica", "canoso", "cansada", "cansado", "canta", "cantando", "cántaro", "cárcel", "carga", "cárgalo", "cargando", "cargar", "caro", "casa", "casa municipal", "cásate", "cascada", "castellanizado", "cazador", "cedro", "celosa", "celoso", "ceniza", "cerdo", "cerebro", "cerrado", "cerrado", "cerrado", "cerro", "chacal", "chamaco", "chamarra", "chango", "chapulín", "chayote", "chico", "chile", "chilero", "choncho", "chueco", "chueco", "chupalo", "cielo", "cien", "cigarro", "cincel", "cinco", "cintura", "ciruela", "clara", "cocido", "coco", "codo", "coincide", "colado", "colgado", "collar", "comadre", "comadre", "comadreja", "come", "cómelo", "comerciante", "comida", "comió", "cómo", "como (adverbio)", "como hoy", "completo", "compra", "compra", "cómpralo", "conducho", "confesado", "conocedor", "conocerse", "contento", "contesta", "copal ", "corredor", "corrió", "cortado", "córtalo", "corto", "cosecha", "costilla", "coyol", "criatura", "cristalina", "cuánto", "cuatro", "cucaracha", "cuchara", "cuchillo", "cuerpo", "culebra", "culo", "culpa", "cuñada", "cuñada", "cuñado","agarrados de la mano", "casamiento en el municipio", "cerrar con tira de madera", "comiendo en case ajena", "comió en el camino", "con enojo", "con esfuerzo", "cortar con cuchillo", "cosa alargada", "cosa corta", "cosechar café", "costurar alguna cosa", "crecimiento rápido de persona", "cruza el río", "cuerno de animal", "dale", "daño", "dedo", "dejado", "delgado", "delicado", "demonio", "derecho", "derrumbar", "desatado", "descalzo", "descansa", "descompuesto", "descuarizar", "desgracia", "desminuyendo", "desnudarse", "desnudo", "despierta", "desprecia", "desprecio", "despulpa", "destapado", "destinado", "desyerbado", "deuda", "diablo", "diente", "dieza", "diferente", "difícil", "dile", "dinamita", "dinero", "dinero", "dinero ", "disgustado", "doblar", "donde", "dónde", "dos", "duele", "dueño", "duerme", "duerme", "duérmete", "dulce", "dura", "durable", "durmiendo", "duro", "duró","dando vuelta", "de memoria", "de pico amarillo", "del mismo pueblo", "del otro lado", "desde entonces", "doblar ropa", "dolor de cabeza", "educado", "ellos", "embarazada", "empezando", "en el municipio", "en la milpa", "en pareja", "en silencio", "encargar", "encuentralo", "endredón", "enemigo", "enfermedad", "enmascarado", "enojado", "enrolla", "entero/entera", "enterrado", "entre diez", "entre todos", "entre varios", "envíalo", "envolver", "envuelto", "envuelvelo", "epazote", "escalera", "escandaliza", "escoba", "escopeta", "escuela", "espalda", "espejo", "espera", "espera", "espera", "espero", "espina", "espíritu", "está comiendo", "está sucediendo", "estaca", "estar cargando", "estar enfermo", "este", "estrecho", "estrella", "estudiando", "evaporando", "excremento", "echar alguna cosa con la mano", "experto sobre la lectura del calendario Mixe", "fabricado", "falda", "falta poco", "favor", "filoso", "flojo", "flor", "fresco", "frío", "fuego", "fuerza", "gallina", "gancho", "gavilán", "gemelo", "gente", "gente borracha", "gente buena", "golpear con el puño", "gordo", "grande", "granizo", "grano", "granos en la boca", "grasa", "grillo", "grita", "grueso", "guajolote", "guapino (árbol)", "guardado", "guardalo", "guayaba", "hablar", "hace falta", "hace rato", "hacer adobe", "hacer calor", "hacha", "hamaca", "hambriento", "hecho", "hembra", "herida", "herida", "herida en la boca", "herramienta", "hierba buena", "hígado", "higo", "higuerilla", "hija", "hijo natural", "hilo", "hincado", "hinchado", "hipo", "hoja", "hoja de ocote", "holgazán", "hombro", "hombro", "hondo", "hondo", "hormiga ", "hormigón", "hoy", "hueco", "huele de noche", "hueso", "hueso de costilla", "hueso de rodilla", "huevo", "hule", "hacer pedazos con un machete", "hermano mayor de la mujer", "iglesia", "iguana", "imitar", "insiste", "intencionalmente", "intestino", "irrita la boca", "jícara", "jícara para servir caldo", "jonote (árbol)", "juego", "juez", "juguete", "Julio ", "juntos", "labios", "labrado", "ladrillo", "ladrón", "lagartija", "las últimas", "lava", "lejos", "lengua", "leña", "levántalo", "levantarse", "limite", "listón", "llave", "llega", "lleno/", "llora", "llorona", "llovizna", "llueve", "lluvia", "lo dispararon", "lo mandaron", "lo mismo", "loco", "lodo", "loma", "lucero de la mañana", "luego", "lugar para bañarse", "lugar", "luna", "machete", "madre", "madrina", "maduro", "maduro", "maíz", "maíz desgranado", "maíz tierno", "maíz", "mala", "malva ", "mamey", "manda", "mandato", "mano", "manojos", "manso", "mañana", "mapache", "mar", "marrano", "marta", "más allá", "masa", "mazacuala ", "mázate ", "me iré", "me retiro", "mecapal", "medicina", "medido", "mediodía", "melenudo", "mentiroso/a", "mesa", "mesa", "metate", "mezquino", "mídelo", "milpa", "mira", "mira el camino", "mitad", "mixe ", "mojara", "molido", "mosca", "muchacha", "muerto", "mugre", "mujer", "murciélago", "nadie", "nalga/", "nanacastle (árbol)", "nanche", "naranja", "nariz", "natalia", "neblina", "negro", "nido", "niña", "niño", "No", "no hay nadie", "nombre de un árbol", "nombre de un árbol", "nombre de un cerro", "nopal", "nosotros", "novio", "nube", "nudo", "nueve", "nuevo", "nutria", "obo (árbol)", "ochenta", "ocho", "ocote (árbol)", "ofrecido", "oído", "olla", "olvidar", "ombligo", "oreja", "originario", "orina", "otoño", "otra vez", "oye", "padre", "padrino", "pagado", "paisano", "pájaro", "pájaro", "pala", "palma", "palo", "paloma", "pan", "pantalón", "pañal", "pañuelo", "papa", "papel", "pared de barro", "parir", "pariendo", "partes delgadas del cuerpo", "partir una cosa", "pásale", "pasar la mano", "pasó", "patea", "patio", "pecho", "pedacería", "pedazo", "pedir posada", "pegado", "pégalo", "pegamento", "pegar", "peine", "pelado", "pélalo", "peleando", "pelón", "pelón", "peluquero", "perdido", "perdón", "periodo detrás días", "persona ajena", "persona platicadora", "pesado", "pescado", "pez", "pestilencia ", "petate", "pezón", "pide prestado", "pie", "piedra", "piedra caliente", "piel", "pierna", "pintado", "piña", "piojo", "plano", "plátano", "plato", "pobre", "pobre", "podrido", "por ejemplo", "por eso", "por fuera", "por la fuerza", "por su propia voluntad", "porque", "posada", "posible", "preciso", "preso", "prestado/a", "primero", "pronto", "pueblo", "puerco espín", "puerta", "pujando", "pulga", "pulque", "pus", "que duele", "que germina", "quebrado", "quemado", "quien", "quien sabe", "quiere ver", "quiérelo", "quijada", "quitar algo", "rápido", "rasurado", "raya", "reboso", "recelentar", "recíbelo", "recipiente", "recto", "rédito", "reflejo", "regálalo", "remendado", "resbaloso", "resguño", "reventó", "revienta", "revive", "rico", "rincón", "río grande", "risueño", "robado", "rodando", "rodilla", "rodó", "rojo", "ronca", "roñoso", "roto", "sabio", "sácalo", "sal", "salado", "salario", "saliva", "salte", "sangra", "sangre", "sapo", "sazón", "sé", "se abrió", "se acaba", "se acabó", "se agarraron", "se agujereo", "se ahoga", "se ahogó", "se cayó", "se cayó (persona)", "se dobla", "se hace lodo", "se irá", "se queja", "se reproduce", "se sube", "se trabó", "se atoró", "se va", "se va componer", "se ve", "se viene", "seco", "secretaria", "seis", "sellado", "selva", "sembradio", "sembrado", "sembró", "siembra", "semilla", "semilla de calabaza", "señorita", "serete", "serrucho", "servilleta", "servir la comida", "sesenta", "seso", "sí", "síembralo", "siempre", "siete", "sigue reventando", "sin barba", "sin diente", "sin dulce", "sin tomar agua", "sin voluntad", "soldado de soldar", "solo", "sombra ", "sombrero", "sonó", "soñando", "sordo", "su comida", "súbete", "subida", "sucedió", "suegro", "suéltalo", "sueño", "sufre", "sufrimiento", "suplente", "suspira", "suya", "tabla", "talón", "tamal", "tamal", "tamal blanco con sal", "tambo", "tapado", "tapado", "tápalo", "tápalo", "tapar algo", "tapar con palos", "tardado", "tartamudeando", "taza", "tecolote", "tecolote", "tejido", "tejón", "temprano", "tener calor", "tepijilote", "terreno para casa", "testículo", "tiene hipo", "tiene precio", "tierra", "tigre", "tijera", "tira lo ", "tíralo", "tíralo abajo", "tirar granos", "tlacuache", "tocando la guitarra", "todavía no", "todo", "tomate", "tortilla", "tortilla caliente", "tortilla con sal", "tos ferina", "tos", "totalmente lleno", "totomosle", "trabajar enfermo", "trabajo", "trágalo", "tres", "triste", "troje", "trozado", "trueno", "tú", "tu mamá", "tu papá", "tucán", "tusa (animal)","un día", "un peso", "uno", "uno por uno", "uña", "usado", "ustedes", "utensilio de cocina", "uva", "vamonos", "varón", "varón", "ve", "vea lo", "veinte", "ven", "vena", "venado", "vendedor", "véndelo", "verdad", "verdad", "verde", "vergüenza", "vete", "veté", "viejo", "viene", "viento", "viñuela", "violentamente", "violín", "vivo", "vomito", "vuelve a subir", "ya", "yerba mora", "yerno", "yo", "yuca", "zacate", "zacate", "zanate (ave)", "zancudo", "zorrillo", "zurdo/a","ojo"};
    //----------------------------------------------------------------------------------------------------------------------------------
    String mixe[]={"apataayk", "awa'ats", "tsiptuuy", "mënenj", "ta'mam", "apteety", "najajtëp", "tsipëëp", "jatsem","ayoony" ,"kupëk", "atsyuut", "jata'apë", "jaa'myets", "ko'ok", "nëkxëëk", "tekoot", "mëjay", "atooxy", "mats", "nëë", "annëë", "kuutypy", "tsinkuutyp", "maxywiits", "jii", "jata'apë", "antsyiuxk", "ta'tspëky", "kieky", "ka'ky", "muts'pë", "pixy", "nëjë'e", "atajp", "jim", "anma", "kukony", "ajop", "këxp", "jajp", "kutëëkx", "ta'am", "awëëny", "awëën", "atsojkp", "ixtsyaatsy", "tatsy", "iook", "ap", "kujaay", "maxteiky", "aptejk", "awiink", "atsaatsy", "nak", "këpo'xp", "jat", "apëk", "apëjkp", "ixpejp", "tsoke", "jaaj", "jue'e", "pooxyp", "kepy", "i'intsy", "toopy", "kuuy", "tsapyu'u", "nëëts", "axwijtsë", "kexp", "aropë", "tsa'aw", "namiukee", "jayaokpë", "jatu'un", "axwoots", "axajtuk", "kuwitëëy", "axaam", "ixaam", "kupeit", "Aurorë", "kutunk", "atsënapië", "awënëy", "joomy", "axëëy", "pupejtpë","aoy", "mëtëyë", "pa'ay", "akoots", "kumioo", "awëëk", "apux", "awaay", "ets", "ejtsp", "ajtsp", "mënak", "konyt", "tsiip", "tsiiw", "kuka'ay", "kumënaik", "apoo", "peetp", "mox", "moxtsaam", "puj", "amay", "may", "tajk", "kaax", "maxuunk", "maxuunk", "maxuunk", "aats", "kunuukx", "jëyujk", "poop", "jatsyu'u", "jatsyu'u", "aaw", "awak", "atsaam", "atsap'ts", "akootsy", "tsuj", "pëjxuy", "amuukyë", "amuukyë", "awa'an", "tsinuuk", "tëpx", "nixiiki", "ixta'w", "axtaaw","kuaay", "tse'ex", "kuwaay", "kupajk", "kusaam", "amaatsy", "nantsëm", "ixpajk", "jaam", "tsii", "aixëëy", "kanëë", "an", "amon", "jajp", "këë'k", "këjk", "tu'u", "tëytyuu", "kami ixy", "muny", "ëy", "eets", "kanikë", "kupooj", "anu'xëëpy", "anu'xëëpy", "ëëw", "ëëp", "majt", "pu'xiëxk", "tseim", "tseem", "tsëëmp", "këëw", "tsowë", "tëjk", "akujtëjp", "pëk", "tax", "amëxan", "pëkpë", "aj", "amutsk", "amutsk", "kujyam", "kutsy", "kukooxy", "ajiitsy", "akëy", "atuky", "kop", "tsaxy", "mixenk", "nijen", "mi'ka", "mu'u", "akxa", "mutsk", "niiy", "aniiy", "kutsy", "aney", "key", "muujk", "tsajp", "moko'px", "juu'k", "pa'ant", "mëkooxk", "tiinky", "tuuny", "të'kxy", "këë'w", "tsajkum", "këkox", "napiatëp", "anaxy", "kutëy", "nantsëm", "kuaan", "tajkuaan", "iixy", "kay", "jëë'x", "ajuupyë", "kay", "kaaxy", "nej", "nejpy", "jata'apë", "ka'pxy", "juupy", "ajuupyë", "juy", "tujtpaak", "mayats", "jajpë jia'ay", "nayixy atep", "jootkuik", "atsow", "poom", "tejkwiin", "keek", "kepy", "tsuk", "kon", "tsijkp", "katsy", "kum", "maxuunk", "tëxy", "naak", "mëtaaxk", "amuutsy", "kutsyarë", "tsujt", "nini'kx", "tsa'any", "kuuts", "pojkpë", "kapy", "ojy", "jëy","nawyj'tsëp", "akujpëjp", "apax", "mëkaapy", "tukaay", "amaat", "nimajaa", "axtsuk", "ayoony", "akon", "piip", "axuy", "axyeek", "nëënax", "kapk", "mo'ow", "katyeey", "këwa'ax", "ixmatsy", "pejy", "amaay", "kaoypia", "teye", "jits", "kejy", "teikwaats", "pokx", "maat", "e'ek", "ayoony", "aweenëëy'py", "jen", "axwa'ats", "mayuik", "pej'xp", "apejkp", "jet", "kuwa'ats", "nipetakëey", "mootsy", "nukxy", "mëjkuu", "tëëts", "majk", "tekatsy", "tsip", "nëma'a", "nëtujt", "meeny", "men", "menkiop", "ejkëp", "ots", "maa", "maa", "metsk", "pa'amp", "nijaay", "maaj", "maap", "maaw", "pa'ak", "ijp", "jejp", "maap", "juuny", "jejk", "awëtijp", "akupajp", "apu'ts", "mëkukajp", "awiim", "jajty", "ane'ek", "kupoj","axpëky", "ajkxy", "jaaotyp", "tsontaakp", "akujk", "kamjoit", "ametsk", "ametsy", "aneem", "paat", "axuk", "mëtsip", "pa'am", "aptoot", "jotma'p", "pit", "amuum", "tajë'y", "nëmajk", "nikëxy", "nëmaay", "kex", "amots", "motsy", "nëmots", "puteeit", "teeny", "amayeepy", "peetk", "tuktk", "kapxoyëyë", "jëëxk", "ijty", "aix", "awix", "jaix", "ki'xk", "apty", "jewe'ny", "kaapy", "jajtëp", "kup", "tëëmp", "pëkëp", "ata", "axuuts", "mëtsaa", "ixpeky", "ajojp", "të'ëny", "awokëëw", "kuxëë","kojy", "ëxuk", "jaween", "mayajt", "jëjp", "nuux", "pëjy", "nik", "tëtsy", "jëën", "majaa", "tseey", "jo'k", "kuwaj", "axeeny", "ja'ay", "amukiëjaay", "oyjaay", "tex", "nik'xe", "mëj", "tëtstuu", "puuts", "apuuts", "on", "tsiktsy", "ayaaxp", "mapxy", "tuut", "akpejy", "pekeiky", "pëkë'ëk", "pox", "kapk", "mayjajp", "aamy", "muuts", "anpëkp", "jaatsye", "tsaay", "kax", "kojy", "to'oxy", "jot", "tsëtsyë", "ajot", "tumpejt", "tsajpnëmaank", "joot", "piits", "tsajptsooy", "toxyuunk", "akony", "piity", "kojxtënaa", "kixp", "nëjëë", "aay", "tsinaay", "nuux", "kejkyopk", "keky", "këëk", "kom", "nuj", "akooy", "jata'a", "jut", "matap", "pajk", "katsypajk", "koxkopk", "tsetyuuty", "oomy", "apuxëëw", "ay", "tsajtëjk", "tutsëj", "amaapy", "mëmëkta'ak", "najoot", "tiintsy", "axiik", "tsim", "jee'p", "pa'ants", "ëyëë", "konk", "iik", "julië", "muiky", "ateem", "tsetsy", "muutsy", "metspë", "tik", "jakoyë", "puj", "jakuem", "toots", "ja'aw", "konë'ëk", "pëtëëk", "tsepaant", "kuu't", "awaats", "ja'p", "kuxyë", "jëëpy", "ayaaxy", "tsatyuu", "tuup", "tuu", "tujë", "kejkë", "janëyë", "kuiin", "moonts", "tun", "jaxyëëm", "jatyi", "tsitaak", "it", "po'o", "pujx", "taj", "otiaj", "otsyam", "tsa'am", "mook", "mokëkxy", "nikmook", "maaky", "axëëm", "tamujts", "potkaak", "ana'amp", "kutujt", "kë'ë", "apity", "maax", "japoom", "nëyaay", "mejy", "atsëm", "kexytsyik", "nijim", "jëtsy", "puk", "pax", "atakampëtsy", "jewa'k", "tsëmtsaay", "tsooy", "kipxy", "kujxyëë", "kupeeny", "anëë", "kapiejt", "meexë", "paan", "tsipty", "kipx", "kam", "eep", "tuijxp", "kupk", "ayuuk", "tsaam", "me'ey", "niix", "kiix", "o'kpë", "puu'ty", "toxyëjk", "tëëxy", "nipën", "ixmaatsy", "nëëky", "tux", "tsuiik", "jëput", "tay", "nëma", "tsixy", "pe'eny", "kixyunk", "pina'k", "ka'p", "apak", "atsyaam", "tsëëny", "apkop", "taat", "ëtsyatëm", "jamië'ët", "jok", "poox", "taaxtujk", "jemy", "nëkaa","pikxmaxy", "mëtajpx", "tuktuujk", "tsiin", "aweenëëy", "taatsk", "tu'ts", "jatyëkoy", "puutsk", "taatsak", "kunaax", "ta'ats", "poot", "jataook", "mëtow", "teety", "tetykuaan", "kujuy", "mëkunaax", "axkakak", "joon", "pu'xyuun", "jow", "kepy", "muuxy", "tsakeekt", "ixyë", "mots", "payë", "tsaj'muny", "naiky", "potsy", "ke'exp", "ke'exp", "apiiny", "ajetee", "nax", "ajaax", "majx", "nejp", "tëpaa", "katsyak", "tsay", "tu'teik", "ayoopy", "ootsy", "ton", "otsk", "kox", "kaxk", "tak", "jep", "tsiptuump", "kutajt", "kutë'ëx", "me'xpë", "tëkojy", "mekx", "maaxk", "tekëjaay", "akapx", "jemtsy", "akx", "akx", "tikts", "to'oky", "tsiits", "anu'xp", "teiky", "tsaa", "antsaa", "ak", "puuy", "kats", "tsikty", "aat", "jooy", "ka'ak", "texy", "ayoop", "ëyoop", "pu'uts", "axtaamëts", "paaty", "ajëëxk", "atsip", "atmsoo", "jatits", "amejtstaakp", "mapaat", "mëktaaik", "tsuim", "anukx", "jawiin", "pakyë", "ka'p", "aptykaa", "tëjk'akë", "ajëjp", "pix", "keetsy", "komy","atoom", "mujxp", "pu'u", "no'oki", "pën", "panejtyë", "ixaam", "tsok", "apajk", "ajaxtu'ut", "tsooky", "kume'exy", "keets", "kuwëën", "ajokxëëw", "kontsow", "apëkëny", "kujk", "menyunk", "ajajp", "niyeki", "axuyëy", "nokts", "tsekxy", "pojt", "pot", "juikypëjp", "mayë", "atsikx", "mëjnëë", "axiik", "meetsy", "pik", "kox", "kuna'x", "tsapts", "tok'xp", "jëk", "këëts", "maapie", "juut", "kaan", "taamts", "mëjuny", "tsujjy", "pëtsem", "taj'xp", "ne'py", "puun", "maj", "jajpëtsy", "awaats", "këjxp", "këjk", "nimyajtsë", "jujt", "ji'kxp", "ji'xy", "ka'w", "këtaw", "aojtsp", "amoontsëëpy", "ataakamp", "ëjëjp", "mayiipy", "pejp", "je'x", "je'x", "nëkxp", "oyëwamp", "kaxje'kp", "majtsp", "të'ëts", "ja'apyë", "tutujk", "aootsy", "itkujk", "kamtëjk", "kojy", "niip", "niip", "tëëm", "tsipajk", "këxyii", "kejki", "jëtk", "kaakmiots", "apëkëëw", "tuwë'px", "ko'oxy", "jaantsy", "koj", "itëm", "juxtujk", "jakpot", "atak", "atuk", "tsek'tsy", "akutë'ëts", "nëkoopë", "atsayee", "natiuuk", "aapk", "kujup", "nojk", "kumaap", "nat", "jyek'exy", "këxpet", "kexwin", "jaj'te", "tsuap", "axmats", "kumaa", "ëyoop", "axtsaatsy", "namëj", "mëkxë'p", "jya'a","pu'uy", "tekixpok", "më'ëky", "panuuky", "taamtsmë'ëky", "tampë", "atsiitsy", "nipeeny", "ajup", "kuwits", "ajiits", "akap", "jejky", "anaakp", "tasë", "ju'k", "kujx", "taaik", "tsik", "jopy", "ano'këpëtsy", "nuun", "tëjkop", "tutsyaa", "nëjëp", "tsopaatp", "naax", "kaa", "me'px", "ixcaats", "axkaats", "kuka'tsnax", "axwë'j", "mokx", "koop", "ka'në", "kësyë", "ko'on", "kaaky", "amkaaky", "taamtskaaky", "ji'xoj", "oj", "apëëtsy", "akts", "apaam", "tuunk", "jëën", "tuwëëk", "ta'mape", "tsex", "pooty", "anee", "miitsy", "mtaj", "mteety", "kaat", "tëptsy", "tuk'xëë", "peexy", "tu'uk", "atu'ukaty", "këxooky", "pak", "miitsy ajkx", "pok", "tsaatypy", "jam", "jexy", "mixy", "ijxp", "ix", "ipx", "min", "eemy", "naan", "tokpë", "took", "tëmts", "teyajt", "pu'ts", "tsotiuun", "nëkx", "ataak", "amëj", "mimp", "poj", "mëxampuuts", "atsipamaat", "jëtk", "juiky", "ëëtsy", "jakpet","tëë", "mujtyaay", "më'ët", "ëëtsy", "kupixy", "mëëy", "nektsy", "piijx", "pëëx", "paats", "ana'jty","wiin"};

    int index=0;
    int puchado=0;
    ImageView imagen,notClickable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traductor);

        ETtrad = findViewById(R.id.editText3);
        texttrad = findViewById(R.id.texttrad);
        pronun = findViewById(R.id.textView4);
        traducir = findViewById(R.id.buttontrad);
        Vid = findViewById(R.id.videoView3);
        imagen = findViewById(R.id.imageView3);
        notClickable=findViewById(R.id.notAbleToClick);

        Vid.setVisibility(View.INVISIBLE);
        pronun.setVisibility(View.INVISIBLE);
        notClickable.setVisibility(View.INVISIBLE);

        imagen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    recorre();
                    Video();
                }
        });

            traducir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        recorre();
                        Video();
                }
            });
    }
    public void recorre(){
        traducir.setVisibility(View.INVISIBLE);
        imagen.setVisibility(View.INVISIBLE);
        notClickable.setVisibility(View.VISIBLE);

        boolean band =false;
        String tring = ETtrad.getText().toString().toLowerCase();
        if(tring.equals("1")||tring.equals("2")||tring.equals("3")||tring.equals("4")||tring.equals("5")||tring.equals("6")||tring.equals("7")          ||tring.equals("8")||tring.equals("9")||tring.equals("10")){
            if(tring.equals("1")){
                tring="uno";
            }
            else if(tring.equals("2")){
                tring="dos";
            }else if(tring.equals("3")){
                tring="tres";
            }else if(tring.equals("4")){
                tring="cuatro";
            }else if(tring.equals("5")){
                tring="cinco";
            }else if(tring.equals("6")){
                tring="seis";
            }else if(tring.equals("7")){
                tring="siete";
            }else if(tring.equals("8")){
                tring="ocho";
            }else if(tring.equals("9")){
                tring="nueve";
            }else if(tring.equals("10")){
                tring="diez";
            }
            for (int i = 0; i < esp.length; i++) {
                if (tring.equals(esp[i])) {
                    index = i;
                    band = true;
                    break;
                }
            }
        if(tring.isEmpty()) {
            ETtrad.setError("por favor, ingrese una palabra");
            traducir.setVisibility(View.VISIBLE);
            imagen.setVisibility(View.VISIBLE);
            notClickable.setVisibility(View.INVISIBLE);
            band = true;
            }
        }else if(!band){
            for (int i = 0; i < esp.length; i++) {
                if (tring.equals(esp[i])) {
                    index = i;
                    band = true;
                    break;
                }
            }
        }
            if(!band) {
                ETtrad.setError("La palabra '"+tring+"' no se encuentra");
                traducir.setVisibility(View.VISIBLE);
                imagen.setVisibility(View.VISIBLE);
                notClickable.setVisibility(View.INVISIBLE);

            }else if(band){
                texttrad.setText(mixe[index]);
                imagen.setVisibility(View.VISIBLE);
                notClickable.setVisibility(View.INVISIBLE);
            }
    }

    public void Video(){
        hacerVisible();
        String fileplace="android.resource://" + getPackageName() + "/raw/";
        String A = ETtrad.getText().toString().toLowerCase();
        traducir.setVisibility(View.INVISIBLE);
        imagen.setVisibility(View.INVISIBLE);
        notClickable.setVisibility(View.VISIBLE);
        if (ETtrad.getText().toString().isEmpty()) {
            ETtrad.setError("Ingrese una palabra");
            traducir.setVisibility(View.VISIBLE);
            imagen.setVisibility(View.VISIBLE);
            notClickable.setVisibility(View.INVISIBLE);

        } else {
            try {
                if (puchado == 0) {
                    AudioManager audio = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
                    audio.adjustStreamVolume(AudioManager.STREAM_MUSIC,
                            AudioManager.ADJUST_RAISE, AudioManager.FLAG_SHOW_UI);
                } else if (puchado == 1) {
                    Toast.makeText(getApplicationContext(), "Recuerda subir el volumen para escuchar la pronunciacion", Toast.LENGTH_LONG).show();
                }
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(ETtrad.getWindowToken(), 0);
            } catch (NullPointerException exception) {
                Toast.makeText(getApplicationContext(), "se ha producido un error,\n lo sentimos :(", Toast.LENGTH_LONG).show();
            }
            traducir.setVisibility(View.INVISIBLE);}
            imagen.setVisibility(View.INVISIBLE);
            notClickable.setVisibility(View.VISIBLE);

        if (A.equals("uno")||A.equals("1")) {
            String filename="uno";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("dos")||A.equals("2")) {
            String filename="dos";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("tres")||A.equals("3")){
            String filename="tres";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }
        else if(A.equals("cuatro")||A.equals("4")){
            String filename="cuatro";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("cinco")||A.equals("5")){
            String filename="cinco";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("seis")||A.equals("6")){
            String filename="seis";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }
        else if(A.equals("siete")||A.equals("7")){
            String filename="siete";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("ocho")||A.equals("8")){
            String filename="ocho";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("nueve")||A.equals("9")){
            String filename="nueve";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("diez")||A.equals("10")){
            String filename="diez";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("boca")){
            String filename="boca";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("cabeza")){
            String filename="cabeza";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("ombligo")){
            String filename="ombligo";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("oreja")){
            String filename="oreja";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("pie")) {
            String filename="pie";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }else if(A.equals("ojo")){
            String filename="ojo";
            String rep=fileplace+filename;
            Vid.setVideoURI(Uri.parse(rep));
            Vid.start();
            Vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    hacerInvisible();
                }
            });
        }
        else{
            hacerInvisible();
        }
        puchado++;
    }
    void hacerVisible(){
        Vid.setVisibility(View.VISIBLE);
        pronun.setVisibility(View.VISIBLE);
        imagen.setVisibility(View.INVISIBLE);
        notClickable.setVisibility(View.VISIBLE);

    }
    void hacerInvisible(){
        Vid.setVisibility(View.INVISIBLE);
        pronun.setVisibility(View.INVISIBLE);
        traducir.setVisibility(View.VISIBLE);
        imagen.setVisibility(View.VISIBLE);
        notClickable.setVisibility(View.INVISIBLE);
    }
}


