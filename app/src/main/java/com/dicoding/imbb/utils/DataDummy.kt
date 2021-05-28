package com.dicoding.imbb.utils

import com.dicoding.imbb.data.MovieEntity
import com.dicoding.imbb.data.TvShowEntity

object DataDummy{
    fun generateDummyMovie(): ArrayList<MovieEntity>{
        val movie = ArrayList<MovieEntity>()

        movie.add(
            MovieEntity(
                "m1",
                "Interstellar",
                "Christopher Nolan",
                "Jonathan Nolan, Christopher Nolan",
                "A team of explorers travel through a wormhole in space in an attempt to ensure humanity's survival.",
                "8.6",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
                "Adventure, Drama, Sci-Fi",
                "1,551,604",
                "2014",
                "7 November 2014",
                "169",
                "https://www.imdb.com/title/tt0816692/"
            )
        )
        movie.add(
            MovieEntity(
                "m2",
                "Inception",
                "Christopher Nolan",
                "Christopher Nolan",
                "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
                "8.8",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/9gk7adHYeDvHkCSEqAvQNLV5Uge.jpg",
                "Action, Adventure, Sci-Fi",
                "2,107,010",
                "2010",
                "16 July 2010",
                "148",
                "https://www.imdb.com/title/tt1375666/?ref_=fn_al_tt_1"
            )
        )
        movie.add(
            MovieEntity(
                "m3",
                "Forest Gump",
                "Robert Zemeckis",
                "Winston Groom, Eric Roth",
                "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.",
                "8.8",
                "https://upload.wikimedia.org/wikipedia/en/6/67/Forrest_Gump_poster.jpg",
                "Drama, Romance",
                "1,845,487",
                "1994",
                "6 July 1994",
                "142",
                "https://www.imdb.com/title/tt0109830/?ref_=fn_al_tt_1"
            )
        )
        movie.add(
            MovieEntity(
                "m4",
                "Joker",
                "Todd Phillips",
                "Todd Phillips, Scott Silver",
                "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.",
                "8.4",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
                "Crime, Drama, Thriller",
                "990,648",
                "2019",
                "4 October 2019",
                "129",
                "https://www.imdb.com/title/tt7286456/?ref_=fn_al_tt_1"
            )
        )
        movie.add(
            MovieEntity(
                "m5",
                "Shutter Island",
                "Martin Scorsese",
                "Laeta Kalogridis, Dennis Lehane",
                "In 1954, a U.S. Marshal investigates the disappearance of a murderer who escaped from a hospital for the criminally insane.",
                "8.2",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/kve20tXwUZpu4GUX8l6X7Z4jmL6.jpg",
                "Mystery, Thriller",
                "1,155,738",
                "2010",
                "19 February 2010",
                "138",
                "https://www.imdb.com/title/tt1130884/?ref_=fn_al_tt_1"
            )
        )
        movie.add(
            MovieEntity(
                "m6",
                "The Sixth Sense",
                "M. Night Shyamalan",
                "M. Night Shyamalan",
                "A boy who communicates with spirits seeks the help of a disheartened child psychologist.",
                "8.1",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fIssD3w3SvIhPPmVo4WMgZDVLID.jpg",
                "Drama, Mystery, Thriller",
                "922,142",
                "1999",
                "6 August 1999",
                "107",
                "https://www.imdb.com/title/tt0167404/?ref_=nv_sr_srsg_0"
            )
        )
        movie.add(
            MovieEntity(
                "m7",
                "Room",
                "Lenny Abrahamson",
                "Emma Donoghue, Emma Donoghue",
                "Held captive for 7 years in an enclosed space, a woman and her young son finally gain their freedom, allowing the boy to experience the outside world for the first time.",
                "8.1",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/pCURNjeomWbMSdiP64gj8NVVHTQ.jpg",
                "Drama, Thriller",
                "380,458",
                "2015",
                "22 January 2016",
                "118",
                "https://www.imdb.com/title/tt3170832/?ref_=nv_sr_srsg_0"
            )
        )
        movie.add(
            MovieEntity(
                "m8",
                "Gone Girl",
                "David Fincher",
                "Gillian Flynn, Gillian Flynn",
                "With his wife's disappearance having become the focus of an intense media circus, a man sees the spotlight turned on him when it's suspected that he may not be innocent.",
                "8.1",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/qymaJhucquUwjpb8oiqynMeXnID.jpg",
                "Drama, Mystery, Thriller",
                "879,590",
                "2014",
                "3 October 2014",
                "149",
                "https://www.imdb.com/title/tt2267998/?ref_=fn_al_tt_1"
            )
        )
        movie.add(
            MovieEntity(
                "m9",
                "Hacksaw Ridge",
                "Mel Gibson",
                "Robert Schenkkan, Andrew Knight",
                "World War II American Army Medic Desmond T. Doss, who served during the Battle of Okinawa, refuses to kill people, and becomes the first man in American history to receive the Medal of Honor without firing a shot.",
                "8.1",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/fTuxNlgEm04PPFkr1xfK94Jn8BW.jpg",
                "Biography, Drama, History",
                "448,514",
                "2016",
                "4 November 2016",
                "139",
                "https://www.imdb.com/title/tt2119532/?ref_=fn_al_tt_1"
            )
        )
        movie.add(
            MovieEntity(
                "m10",
                "Mad Max: Fury Road",
                "George Miller",
                "George Miller, Brendan McCarthy",
                "In a post-apocalyptic wasteland, a woman rebels against a tyrannical ruler in search for her homeland with the aid of a group of female prisoners, a psychotic worshiper, and a drifter named Max.",
                "8.1",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/8tZYtuWezp8JbcsvHYO0O46tFbo.jpg",
                "Action, Adventure, Sci-Fi",
                "899,312",
                "2015",
                "15 May 2015",
                "120",
                "https://www.imdb.com/title/tt1392190/?ref_=nv_sr_srsg_0"
            )
        )
        return movie
    }

    fun generateDummyTvShow(): ArrayList<TvShowEntity>{
        var tvShow = ArrayList<TvShowEntity>()

        tvShow.add(
            TvShowEntity(
                "t1",
                "Breaking Bad",
                "Vince Gilligan",
                "A high school chemistry teacher diagnosed with inoperable lung cancer turns to manufacturing and selling methamphetamine in order to secure his family's future.",
                "9.5",
                "https://m.media-amazon.com/images/M/MV5BMjhiMzgxZTctNDc1Ni00OTIxLTlhMTYtZTA3ZWFkODRkNmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY268_CR5,0,182,268_AL_.jpg",
                "Crime, Drama, Thriller",
                "1,503,537",
                "2008 - 2013",
                "5",
                "49",
                "62",
                "https://www.imdb.com/title/tt0903747/?ref_=fn_al_tt_1"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t2",
                "Game of Thrones",
                "David Benioff, D.B. Weiss",
                "Nine noble families fight for control over the lands of Westeros, while an ancient enemy returns after being dormant for millennia.",
                "9.3",
                "https://m.media-amazon.com/images/M/MV5BYTRiNDQwYzAtMzVlZS00NTI5LWJjYjUtMzkwNTUzMWMxZTllXkEyXkFqcGdeQXVyNDIzMzcwNjc@._V1_UY268_CR7,0,182,268_AL_.jpg",
                "Action, Adventure, Drama",
                "1,804,056",
                "2011 - 2019",
                "8",
                "57",
                "73",
                "https://www.imdb.com/title/tt0944947/?ref_=nv_sr_srsg_0"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t3",
                "Rick and Morty",
                "Dan Harmon, Justin Roiland",
                "An animated series that follows the exploits of a super scientist and his not-so-bright grandson.",
                "9.2",
                "https://m.media-amazon.com/images/M/MV5BZjRjOTFkOTktZWUzMi00YzMyLThkMmYtMjEwNmQyNzliYTNmXkEyXkFqcGdeQXVyNzQ1ODk3MTQ@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "Animation, Adventure, Comedy",
                "388,172",
                "2013 - now",
                "5",
                "23",
                "42",
                "https://www.imdb.com/title/tt2861424/?ref_=nv_sr_srsg_0"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t4",
                "Human Planet",
                "John Hurt",
                "Like all life forms, humanity partially adapts to types of natural environment, yet also tends to change them. Each episode examines how life differs for men and nature in some type of environment, from Arctic to desert and jungle, from coasts to mountains.",
                "9.0",
                "https://m.media-amazon.com/images/M/MV5BMjdhZjQzYjYtM2FmNS00Y2ExLThjODEtZGQzY2M3OWYzYzc0XkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UY268_CR3,0,182,268_AL_.jpg",
                "Documentary",
                "24,077",
                "2011",
                "1",
                "50",
                "8",
                "https://www.imdb.com/title/tt1806234/?ref_=fn_al_tt_1"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t5",
                "Attack on Titan",
                "Hajime Isayama",
                "After his hometown is destroyed and his mother is killed, young Eren Jaeger vows to cleanse the earth of the giant humanoid Titans that have brought humanity to the brink of extinction.",
                "225,338",
                "https://m.media-amazon.com/images/M/MV5BMTY5ODk1NzUyMl5BMl5BanBnXkFtZTgwMjUyNzEyMTE@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "Animation, Action, Adventure",
                "225,338",
                "2013 - 2021",
                "4",
                "24",
                "86",
                "https://www.imdb.com/title/tt2560140/?ref_=nv_sr_srsg_0"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t6",
                "Black Mirror",
                "Charlie Brooker",
                "An anthology series exploring a twisted, high-tech multiverse where humanity's greatest innovations and darkest instincts collide.",
                "8.8",
                "https://m.media-amazon.com/images/M/MV5BYTM3YWVhMDMtNjczMy00NGEyLWJhZDctYjNhMTRkNDE0ZTI1XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "Drama, Sci-Fi, Thriller",
                "456,504",
                "2011 - 2019",
                "5",
                "60",
                "22",
                "https://www.imdb.com/title/tt2085059/?ref_=fn_al_tt_1"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t7",
                "BoJack Horseman",
                "Raphael Bob-Waksberg",
                "BoJack Horseman was the star of the hit television show \"Horsin' Around\" in the '80s and '90s, now he's washed up, living in Hollywood, complaining about everything, and wearing colorful sweaters.",
                "8.7",
                "https://m.media-amazon.com/images/M/MV5BYWQwMDNkM2MtODU4OS00OTY3LTgwOTItNjE2Yzc0MzRkMDllXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "Animation, Comedy, Drama",
                "118,063",
                "2014 - 2020",
                "6",
                "25",
                "77",
                "https://www.imdb.com/title/tt3398228/?ref_=nv_sr_srsg_0"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t8",
                "Shigatsu wa kimi no uso",
                "Kasumi Yao, Juichi Uehara,",
                "A piano prodigy who lost his ability to play after suffering a traumatic event in his childhood is forced back into the spotlight by an eccentric girl with a secret of her own.",
                "8.6",
                "https://m.media-amazon.com/images/M/MV5BZjE0N2FhZDMtZTM0OS00ZGMyLWFhODItOGVmYzU0Yjg4ZWFlXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UY268_CR4,0,182,268_AL_.jpg",
                "Animation, Drama, Music",
                "19,076",
                "2014 - 2015",
                "1",
                "23",
                "23",
                "https://www.imdb.com/title/tt3895150/?ref_=nv_sr_srsg_0"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t9",
                "Love, Death & Robots",
                "Tim Miller",
                "A collection of animated short stories that span various genres including science fiction, fantasy, horror and comedy.",
                "8.5",
                "https://m.media-amazon.com/images/M/MV5BYjEwOWQ0MjktMjZjNy00Mzc1LWE5NTItMDQ1Yjc0Zjk0NTBlXkEyXkFqcGdeQXVyMTEyMjM2NDc2._V1_UX182_CR0,0,182,268_AL_.jpg",
                "Animation, Short, Comedy",
                "103,261",
                "2019 - now",
                "2",
                "15",
                "19",
                "https://www.imdb.com/title/tt9561862/?ref_=nv_sr_srsg_0"
            )
        )
        tvShow.add(
            TvShowEntity(
                "t10",
                "Mr. Robot",
                "Sam Esmail",
                "Elliot, a brilliant but highly unstable young cyber-security engineer and vigilante hacker, becomes a key figure in a complex game of global dominance when he and his shadowy allies try to take down the corrupt corporation he works for.",
                "8.5",
                "https://m.media-amazon.com/images/M/MV5BMzgxMmQxZjQtNDdmMC00MjRlLTk1MDEtZDcwNTdmOTg0YzA2XkEyXkFqcGdeQXVyMzQ2MDI5NjU@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "Crime, Drama, Thriller",
                "339,544",
                "2015 - 2019",
                "4",
                "49",
                "46",
                "https://www.imdb.com/title/tt4158110/?ref_=nv_sr_srsg_0"
            )
        )
        return tvShow
    }
}