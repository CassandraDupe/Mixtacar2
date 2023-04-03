-- Initialisation des tables
INSERT INTO Country(code, name) VALUES
    ('FR', 'France'), -- Les clés sont auto-générées
    ('UK', 'United Kingdom'),
    ('US', 'United States of America');


INSERT INTO utilisateur(nom, prenom, adresse_mail, mdp) VALUES
    ('AUBER','Coline','coline.auber@etud.univ-jfc.fr','Ratchoum!'),
    ('DUPE','Cassandra','cassandra.dupe@etud.univ-jfc.fr','je@meconnecte'),
    ('FERON','Mélanie','melanie.feron@etud.univ-jfc.fr','Oupsi@45?');

INSERT INTO Note(valeur, noteur_id, notee_id) VALUES
    (5, 1, 2),
    (4, 2, 1);


INSERT INTO arret (nom, lat, lon) VALUES
    ('ISIS','43.62504714626731', '2.2691637152404454'),
    ('SuperU','43.62166095026758', '2.2692495459245734'),
    ('Les Ateliers','43.602434722823006', '2.2533600134717204'),
    ('Faïencerie','43.61026136347053', '2.2364788227495556'),
    ('Place Jean-Jau','43.605548577991456', '2.2414236097831846');

INSERT INTO circuit (DTYPE, horaire, arret_arrivee_id, arret_depart_id) VALUES
    ('CIRCUIT','2023-04-03',4, 1),
    ('CIRCUIT','2023-04-15',2, 4);
