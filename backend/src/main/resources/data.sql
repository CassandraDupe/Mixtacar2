-- Initialisation des tables
INSERT INTO Country(code, name) VALUES
    ('FR', 'France'), -- Les clés sont auto-générées
    ('UK', 'United Kingdom'),
    ('US', 'United States of America');


INSERT INTO utilisateur(nom, prenom, adresse_mail, mdp) VALUES
    ('AUBER','Coline','coline.auber@etud.univ-jfc.fr','Ratchoum!'),
    ('FERON','Mélanie','melanie.feron@etud.univ-jfc.fr','Oupsi@45?');

INSERT INTO Note(valeur, noteur_id, notee_id) VALUES
    (5, 1, 2),
    (4, 2, 1);