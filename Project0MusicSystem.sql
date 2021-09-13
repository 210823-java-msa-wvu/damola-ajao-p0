drop table "Playlist" ;
drop table "login_info" ;
drop table "platform_availability" ;
drop table "songs";


create table "songs"
(
	"songid" INT not NULL,
	"title" varchar not Null,
	"artist" varchar not null,
	"genre" varchar not null,
	"release date" date not null,
	 CONSTRAINT "PK_Song" PRIMARY KEY  ("songid")
	);

create table "login_info"(
	"userid" INT not null,
	"username" varchar not null,
	"password" varchar not null,
	"uploader" boolean not null,
	CONSTRAINT "PK_User" PRIMARY KEY  ("userid")
	);
	
create table "playlist"(
	"playlistid" INT not null,
	"userid" INT not null,
	"playlist title" varchar not null,
	"songid" INT not null,
	CONSTRAINT "PK_Playlist" PRIMARY KEY  ("playlistid")
	
);


create table "platform_availability"(
	"platformid" Int not null,
	"songid" INT not NULL,
	"itunes" boolean not null,
	"youtube_music" boolean not null,
	"soundcloud" boolean not null,
	"spotify" boolean not null,
	"youtube_rip" boolean not null,
	CONSTRAINT "PK_Platform" PRIMARY KEY  ("platformid")
	);


   
ALTER TABLE "platform_availability" ADD CONSTRAINT "FK_SongId"
    FOREIGN KEY ("songid") REFERENCES "songs" ("songid") ON DELETE NO ACTION ON UPDATE NO ACTION;
   
ALTER TABLE "playlist" ADD CONSTRAINT "FK_UserId"
    FOREIGN KEY ("userid") REFERENCES "login_info" ("userid") ON DELETE NO ACTION ON UPDATE NO ACTION;
   
ALTER TABLE "playlist" ADD CONSTRAINT "FK_SongId"
    FOREIGN KEY ("songid") REFERENCES "songs" ("songid") ON DELETE NO ACTION ON UPDATE NO ACTION;   
   
   
 /*songs to add
  * 1.That snail house milk song
  * 2.Raven off soundcloud
  * 3.Sinatra songs
  * 4.Pokemon song
  * 5.Radiant Emerald: Diamond In The Sky
  * 6.Radical City: Living In The City
  * 7.Sonic song
  * 8.Myths you forgot kamelia
  * 9.xi - apoptosis
  * 10. Ryo Nakamura - Loading
  * 11. Necessary Discrepancy
  * 12. Super Sonic Racing
  * 13. Venus <Another Phase Mix>
  * 14. Topaz Tatsh
  * 15. Endless Possibilities
  * 
  *   songs to add
  */
   select*from "songs";
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (1, N'Hot Milk','Snail''s House', 'Electronic', '11-17-2016');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (2, N' STRATEGY','RAVENWORKS', 'Symphonic/Orchestral Jazz', '09-07-2013');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (3, N'Fly Me To The Moon','Frank Sinatra', 'Jazz', '04-01-1954');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (4, N'Pokemon Silver/Gold/Crystal - Surf Theme','Junichi Masuda, Go Ichinose, Morikazu Aoki', 'Soundtrack', '11-21-1999');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (5, N'Radiant Emerald: Diamond In The Sky','
Richard Jacques', 'Pop', '11-18-1997');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (6, N'Radical City: Living In The City','Richard Jacques', 'Pop', '11-18-1997');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (7, N'Myths You Forgot','Camellia', 'Hard Techno', '07-11-2021');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (8, N'FM Synthesis Experiment','Camellia', 'Electronic', '12-30-2018');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (9, N'MEGANTO METEOR','Camellia', 'Electronic', '07-16-2016');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (10, N'Loading','Ryo Nakamura', 'Electronic', '04-24-2021');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (11, N'Necessary Discrepancy','Daisuke Ishiwatari', 'Rock', '06-08-2021');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (12, N'Super Sonic Racing','Richard Jacques', 'Pop', '11-18-1997');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (13, N'Topaz ','Tatsh', 'Electronic', '10-27-2011');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (14, N'Venus <Another Phase Mix>','Tatsh', 'Electronic', '10-27-2011');
INSERT INTO "songs" ("songid" , "title", "artist" ,"genre", "release date") VALUES (15, N'Get Busy Living','Gold Fish', 'Electronic', '09-20-2010');

select*from "platform_availability";
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (1,1,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (2,2,false,false,true,false,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (3,3,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (4,4,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (5,5,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (6,6,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (7,7,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (8,8,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (9,9,false,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (10,10,false,false,true,false,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (11,11,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (12,12,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (13,13,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (14,14,true,true,true,true,true);
INSERT INTO "platform_availability" ("platformid" , "songid", "itunes" ,"youtube_music", "soundcloud", "spotify", "youtube_rip") values (15,15,true,true,true,true,true);

select * from "login_info";
INSERT INTO "login_info" ("userid", "username", "password", "uploader") values (1,'jazzman', 'rockisrolling',false);
INSERT INTO "login_info" ("userid", "username", "password", "uploader") values (2,'supahsonic', 'blueisbest',false);
INSERT INTO "login_info" ("userid", "username", "password", "uploader") values (3,'ModAuthority', 'whenindoubtrip',true);
delete from login_info ;

select * from "playlist" ;
INSERT INTO "playlist" ("playlistid" , "userid" , "playlist title" , "songid") values (1, 2, 'Racing Tunes', 5 );
INSERT INTO "playlist" ("playlistid" , "userid" , "playlist title" , "songid") values (2, 2, 'Racing Tunes', 6 );
INSERT INTO "playlist" ("playlistid" , "userid" , "playlist title" , "songid") values (3, 2, 'Racing Tunes', 12 );

INSERT INTO "playlist" ("playlistid" , "userid" , "playlist title" , "songid") values (3, 2, 'Racing Tunes', 12 );

select * from musicproject.songs s
inner join musicproject.platform_availability p
on s.songid = p.songid 


