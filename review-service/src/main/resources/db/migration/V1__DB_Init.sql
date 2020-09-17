create table review (
                        id bigint not null auto_increment,
                        liked bit not null,
                        message longtext,
                        movie_id bigint,
                        user_id bigint,
                        primary key (id)
);

insert into review (id, liked, message, movie_id, user_id) values
(1, true, 'If you love Shawshank then it''s a love that lasts a lifetime. Every viewing brings the same array of emotions - anger - revilement - happiness - sadness - inspiration and a warmth that can reduce the most hardened into misty eyed wonderment. Above all else, though, Shawshank offers hope - not just for characters in a movie - but for a better life and a better world for all of us. 10/10', 1, 2),
(2, true, 'The Shawshank Redemption and To Kill a Mockingbird are the best movies I have ever seen. I do not judge it by it''s technical merits - I don''t really care about that. I have read that Citizen Kane or The Godfather or this or that movie is the best movie ever made. They may have the best technique or be the most influential motion pictures ever made, but not the best. The best movies are ones that touch the soul. It takes a movie like The Shawshank Redemption to touch the soul.', 1, 3),
(3, true, 'The writing was phenomenal and breathtaking. As mentioned before there has been no movie quoted more than this. It is not even the quotes though that makes the writing in here so perfect. It is the symbolism and meaning that went into every scene. There are countless symbols, messages and lines in here that are so memorable yet it is as realistic as a movie could get.', 2, 2),
(4, true, 'One of the all time greats. Or probably the alone greatest thing ever made in the history of cinematography. This movie is both "prequel" and "sequel" of the first godfather movie. I have never watched anything like this in my entire life. This movie has explained the life of underworld people in a great way. It also shows how vengeance eradicates happiness from your life. People don''t even care about their family in greed of power. It''s a masterpiece that can never be written off even after centuries. Even if you are not into these kind of movies, I will suggest to watch it for atleast once in your life or you''ll be deprived of one of the greatest things to watch that have been ever made.', 3, 2);