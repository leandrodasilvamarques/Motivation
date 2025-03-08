package com.leoendemy.motivao.dados

import com.leoendemy.motivao.itens.Keys
import kotlin.random.Random

data class Frase(val frase: String, val botaoId: Int)

class Mock {
    private val ansiedade = Keys.VALOR_DOS_BOTOES.ANSIEDADE
    private val sabedoria = Keys.VALOR_DOS_BOTOES.SABEDORIA
    private val amor = Keys.VALOR_DOS_BOTOES.AMOR
    private val mListaFrases = listOf<Frase>(
        //Ansiedade
        Frase(
            "Os filhos dos leões passam necessidade e sofrem fome, mas aqueles que temem ao Senhor não têm falta de coisa alguma. Salmo 34:10",
            ansiedade
        ),
        Frase(
            "Mesmo na sua velhice, eu serei o seu Deus; cuidarei de vocês quando tiverem cabelos brancos. Eu os criei e os carregarei; eu serei o seu salvador para sempre. Isaías 46:4",
            ansiedade
        ),
        Frase(
            "Peçam, e dar-se-vos-á; buscai, e encontrareis; batei, e abrir-se-vos-á. Porque todo aquele que pede, recebe; e o que busca, encontra; e ao que bate, se abre. Mateus 7:7-8",
            ansiedade
        ),
        Frase(
            "Já fui jovem e agora sou velho, mas nunca vi o justo desamparado, nem seus filhos mendigando o pão. Salmo 37:25",
            ansiedade
        ),
        Frase(
            "Os olhos de todos se voltam em sua direção, esperando o seu sustento, sempre na hora certa. Dia e noite, sem parar, abre a sua mão e derrama a sua bondade sobre todos os seres vivos. Salmo 145:15,16",
            ansiedade
        ),
        Frase(
            "Portanto, se vocês, apesar de serem maus, sabem dar boas coisas aos seus filhos, quanto mais o seu Pai, que está nos céus, dará coisas boas aos que lhe pedirem! Mateus 7:11",
            ansiedade
        ),
        Frase(
            "Dá alimento aos que o temem, lembra-se sempre de sua aliança. Mostrou ao seu povo como é grande o seu poder, dando a Israel as terras das nações por herança. Salmo 111:5,6",
            ansiedade
        ),
        Frase(
            "Aquele que nem mesmo a seu próprio Filho poupou, antes o entregou por todos nós, como não nos dará também com ele todas as coisas? Romanos 8:32",
            ansiedade
        ),
        Frase(
            "Cuidas da terra e a regas; fartamente a enriqueces. Os riachos de Deus transbordam. Para que nunca falte o trigo, pois assim ordenaste. Encharcas os seus sulcos. E aplainas os seus torrões; tu a amoleces com chuvas. E abençoas as suas colheitas. Coroas o ano com a tua bondade, e por onde passas emana fartura. Salmos 65:9-11",
            ansiedade
        ),
        Frase(
            "Ageu 2:Minha é a prata, e meu é o ouro, disse o Senhor dos Exércitos. Ageu 2:8",
            ansiedade
        ),
        Frase(
            "Abençoarei este lugar com fartura; os seus pobres suprirei de pão. Salmo 132:15",
            ansiedade
        ),
        Frase(
            "Confie no SENHOR e faça o bem; habite na terra e desfrute a fidelidade. Deleite-se no SENHOR, e ele atenderá aos desejos do seu coração. Salmos 37:3,4",
            ansiedade
        ),


                //Sabedoria
        Frase(
            "Em seu coração o homem planeja o seu caminho, mas o Senhor determina os seus passos. Provérbios 16:9",
            sabedoria
        ),
        Frase(
            "Deleite-se no Senhor, e ele atenderá aos desejos do seu coração. Salmos 37:4",
            sabedoria
        ),
        Frase(
            "Ouça conselhos e aceite instruções, e acabará sendo sábio. Provérbios 19:20",
            sabedoria
        ),
        Frase(
            "Como é feliz o homem que acha a sabedoria, o homem que obtém entendimento. Provérbios 3:13",
            sabedoria
        ),
        Frase(
            "É melhor obter sabedoria do que ouro! É melhor obter entendimento do que prata! Provérbios 16:16",
            sabedoria
        ),
        Frase(
            "Pois a sabedoria é mais preciosa do que rubis; nada do que vocês possam desejar compara-se a ela. Eu, a sabedoria, moro com a prudência, e tenho o conhecimento que vem do bom senso. Provérbios 8:11-12",
            sabedoria
        ),
        Frase(
            "O temor do Senhor é o princípio da sabedoria; todos os que cumprem os seus preceitos revelam bom senso. Ele será louvado para sempre! Salmos 111:10",
            sabedoria
        ),
        Frase(
            "Se algum de vocês tem falta de sabedoria, peça-a a Deus, que a todos dá livremente, de boa vontade; e lhe será concedida. Tiago 1:5",
            sabedoria
        ),
        Frase(
            "Como é feliz aquele que não segue o conselho dos ímpios, não imita a conduta dos pecadores, nem se assenta na roda dos zombadores! Ao contrário, sua satisfação está na lei do Senhor, e nessa lei medita dia e noite. Salmos 1:1-2",
            sabedoria
        ),
        Frase(
            "Vocês nem sabem o que acontecerá amanhã! Que é a sua vida? Vocês são como a neblina que aparece por um pouco de tempo e depois se dissipa. Tiago 4:14",
            sabedoria
        ),
        Frase(
            "Portanto, não se preocupem com o amanhã, pois o amanhã trará as suas próprias preocupações. Basta a cada dia o seu próprio mal. Mateus 6:34",
            sabedoria
        ),

        //Amor
        Frase(
            "O amor é paciente, o amor é bondoso. Não inveja, não se vangloria, não se orgulha. Não maltrata, não procura seus interesses, não se ira facilmente, não guarda rancor. O amor não se alegra com a injustiça, mas se alegra com a verdade. Tudo sofre, tudo crê, tudo espera, tudo suporta. 1 Coríntios 13:4-7",
            amor
        ),
        Frase(
            "Nem muitas águas conseguem apagar o amor; os rios não conseguem levá-lo na correnteza. Se alguém oferecesse todas as riquezas da sua casa para adquirir o amor, seria totalmente desprezado. Cânticos 8:7",
            amor
        ),
        Frase(
            "Acima de tudo, porém, revistam-se do amor, que é o elo perfeito. Colossenses 3:14",
            amor
        ),
        Frase("Quem não ama não conhece a Deus, porque Deus é amor. 1 João 4:8", amor),
        Frase(
            "Assim, permanecem agora estes três: a fé, a esperança e o amor. O maior deles, porém, é o amor. 1 Coríntios 13:13",
            amor
        ),
        Frase(
            "Sobretudo, amem-se sinceramente uns aos outros, porque o amor perdoa muitíssimos pecados. 1 Pedro 4:8",
            amor
        ),
        Frase(
            "Amados, amemos uns aos outros, pois o amor procede de Deus. Aquele que ama é nascido de Deus e conhece a Deus. 1 João 4:7",
            amor
        ),
        Frase(
            "O ódio provoca dissensão, mas o amor cobre todos os pecados. Provérbios 10:12",
            amor
        ),
        Frase(
            "Nós amamos porque ele nos amou primeiro. Se alguém afirmar: 'Eu amo a Deus', mas odiar seu irmão, é mentiroso, pois quem não ama seu irmão, a quem vê, não pode amar a Deus, a quem não vê. 1 João 4:19-20",
            amor
        ),
        Frase(
            "Respondeu Jesus: 'Ame o Senhor, o seu Deus de todo o seu coração, de toda a sua alma e de todo o seu entendimento'. Este é o primeiro e maior mandamento. E o segundo é semelhante a ele: 'Ame o seu próximo como a si mesmo'. Mateus 22:37-39",
            amor
        ),
        Frase(
            "Ame o Senhor, o seu Deus, de todo o seu coração, de toda a sua alma, de todo o seu entendimento e de todas as suas forças'. O segundo é este: 'Ame o seu próximo como a si mesmo'. Não existe mandamento maior do que estes. Marcos 12:30-31",
            amor
        ),
        Frase(
            "Mas eu digo: Amem os seus inimigos e orem por aqueles que os perseguem, Mateus 5:44",
            amor
        ),
        Frase(
            "Porque nisto consiste o amor a Deus: em obedecer aos seus mandamentos. E os seus mandamentos não são pesados. 1 João 5:3",
            amor
        ),
        Frase(
            "Foi assim que Deus manifestou o seu amor entre nós: enviou o seu Filho Unigênito ao mundo, para que pudéssemos viver por meio dele. Nisto consiste o amor: não em que nós tenhamos amado a Deus, mas em que ele nos amou e enviou seu Filho como propiciação pelos nossos pecados. 1 João 4:9-10",
            amor
        ),
        Frase(
            "Assim conhecemos o amor que Deus tem por nós e confiamos nesse amor. Deus é amor. Todo aquele que permanece no amor permanece em Deus, e Deus nele. Dessa forma o amor está aperfeiçoado entre nós, para que no dia do juízo tenhamos confiança, porque neste mundo somos como ele. No amor não há medo; ao contrário o perfeito amor expulsa o medo, porque o medo supõe castigo. Aquele que tem medo não está aperfeiçoado no amor. 1 João 4:16-18",
            amor
        ),
        Frase(
            "O amor deve ser sincero. Odeiem o que é mau; apeguem-se ao que é bom. Dediquem-se uns aos outros com amor fraternal. Prefiram dar honra aos outros mais do que a vocês. Romanos 12:9-10",
            amor
        ),
        Frase(
            "Sabemos que já passamos da morte para a vida porque amamos nossos irmãos. Quem não ama permanece na morte. 1 João 3:14",
            amor
        ),
        Frase(
            "Nisto conhecemos o que é o amor: Jesus Cristo deu a sua vida por nós, e devemos dar a nossa vida por nossos irmãos. Se alguém tiver recursos materiais e, vendo seu irmão em necessidade, não se compadecer dele, como pode permanecer nele o amor de Deus? Filhinhos, não amemos de palavra nem de boca, mas em ação e em verdade. 1 João 3:16-18",
            amor
        ),
        Frase(
            "Deem graças ao Senhor, porque ele é bom. O seu amor dura para sempre! Salmos 136:1",
            amor
        ),
        Frase(
            "Amem o Senhor, todos vocês, os seus santos! O Senhor preserva os fiéis, mas aos arrogantes dá o que merecem. Salmos 31:23",
            amor
        )

    )

    fun getFrase(id: Int): String {
        val frase = mListaFrases.filter { it.botaoId == id }
        val index = Random.nextInt(frase.size)

        return frase[index].frase
    }
}