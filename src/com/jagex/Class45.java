package com.jagex;

import com.jagex.Class202;
import com.jagex.Class203;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class32;
import com.jagex.Class501;
import com.jagex.Class522;
import com.jagex.Connection;
import com.jagex.Class560_Sub1;
import com.jagex.Class673;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class700;
import com.jagex.client;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Class45 {
   public static int anInt639;
   public static Class45 aClass45_530 = new Class45("This is the developer console. To close, press the ALT-`, ALT-² or ALT-§ keys on your keyboard.", "Das ist die Entwicklerkonsole. Zum Schließen, die Tasten ALT+`, ALT+² oder ALT+§ drücken.", "Ceci est la console de développement. Pour la fermer, appuyez sur les touches ALT+`, ALT+² ou ALT+§.", "Este é o painel de controle do desenvolvedor. Para fechar, pressione ALT-`, ALT-² ou ALT-§.", "Esta es la consola de desarrolador. Para cerrarla, pulsa las teclas ALT-`, ALT-² or ALT-§ en tu teclado.");
   public static Class45 aClass45_463 = new Class45("There was an error executing the command.", "Es gab einen Fehler beim Ausführen des Befehls.", "Une erreur s\'est produite lors de l\'exécution de la commande.", "Houve um erro quando o comando foi executado.", "Se produjo un error al ejecutar el comando.");
   public static Class45 aClass45_464 = new Class45("The developer console can be accessed with ALT-`, ALT-§ or ALT-².", "Die Entwicklerkonsole kann mit ALT+`, ALT+§ oder ALT+² aktiviert werden.", "La console de développement est accessible grâce aux touches ALT+`, ALT+§ ou ALT+².", "O painel de controle do desenvolvedor pode ser acessado com ALT-`, ALT-§ ou ALT-².", "Puedes acceder a la consola de desarrollador con ALT-`, ALT-§ o ALT-².");
   public static Class45 aClass45_465 = new Class45("Unknown developer command: ", "Unbekannter Befehl: ", "Commande inconnue : ", "Comando desconhecido: ", "Comando desconocido: ");
   public static Class45 aClass45_571 = new Class45("Cancel", "Abbrechen", "Annuler", "Cancelar", "Cancelar");
   static Class45 aClass45_498 = new Class45("#Player", "#Spieler", "#Joueur", "#Jogador", "#Jugador");
   static Class45 aClass45_468 = new Class45("Login to a members\' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d\'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.", "Accede a un servidor para miembros para usar este objeto.");
   static Class45 aClass45_469 = new Class45("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l\'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.", "Cambia este vale en cualquier banco por el objeto equivalente.");
   public static Class45 aClass45_499 = new Class45("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");
   public static Class45 aClass45_503 = new Class45("Discard", "Ablegen", "Jeter", "Descartar", "Descartar");
   static Class45 aClass45_472 = new Class45("Combine ", "Kombiniere ", "Vous pouvez combiner ", "Você pode trocar ", "Puedes combinar ");
   static Class45 aClass45_473 = new Class45(" shards of this type to receive a ", " dieser Fragmente, um folgenden Gegenstand herzustellen: ", " de ces fragments pour obtenir l\'objet suivant : ", " desses fragmentos pelo seguinte objeto: ", " de estos fragmentos para obtener el siguiente objeto: ");
   public static Class45 aClass45_474 = new Class45("Combine", "Kombinieren", "Combiner", "Combinar", "Combinar");
   public static Class45 aClass45_487 = new Class45("Take", "Nehmen", "Prendre", "Pegar", "Agarrar");
   public static Class45 aClass45_476 = new Class45("Drop", "Fallen lassen", "Poser", "Largar", "Dejar");
   static Class45 aClass45_553 = new Class45("Ok", "Okay", "OK", "Ok", "OK");
   static Class45 aClass45_490 = new Class45("Select", "Auswählen", "Sélectionner", "Selecionar", "Seleccionar");
   public static Class45 aClass45_479 = new Class45("Continue", "Weiter", "Continuer", "Continuar", "Continuar");
   static Class45 aClass45_480 = new Class45("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.", "Nombre de jugador no válido.");
   static Class45 aClass45_505 = new Class45("You can\'t report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!", "¡No te puedes denunciar a ti mismo!");
   static Class45 aClass45_482 = new Class45("You have sent too many abuse reports today! Do not abuse this system!", "Du hast heute schon zu viele Regelverstöße gemeldet! Missbrauch das System nicht!", "Vous avez signalé trop d’abus pour aujourd’hui. N’abusez pas de ce système !", "Você já denunciou abuso muitas vezes hoje. Não abuse do sistema!", "¡Ya has denunciado demasiadas infracciones hoy! ¡No abuses del sistema!");
   static Class45 aClass45_561 = new Class45("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d\'identité.", "Você não pode denunciar essa pessoa por tentar se passar por um membro da equipe Jagex, pois ela faz parte da equipe.", "Esa persona es miembro del personal de Jagex, no puedes denunciarla por suplantación de identidad.");
   static Class45 aClass45_484 = new Class45("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada ao lado de seu nome.", "Los moderadores de Jagex tienen una corona dorada a un lado del nombre.");
   static Class45 aClass45_485 = new Class45("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você pode denunciar essa pessoa por outro tipo de infração.", "Puedes denunciar a esa persona por otro tipo de infracción.");
   static Class45 aClass45_486 = new Class45("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d\'abus.", "Obrigado. Sua denúncia de abuso foi recebida.", "Gracias, hemos recibido tu denuncia.");
   static Class45 aClass45_617 = new Class45("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.", "Sistema ocupado. No ha sido posible enviar tu denuncia.");
   static Class45 aClass45_488 = new Class45("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido", "Nombre no válido");
   static Class45 aClass45_489 = new Class45("To use this item please login to a members\' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d\'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.", "Accede a un servidor para miembros para usar este objeto.");
   static Class45 aClass45_609 = new Class45("To interact with this please login to a members\' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d\'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.", "Para interactuar, accede a un servidor para miembros.");
   static Class45 aClass45_621 = new Class45("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d\'intéressant.", "Nada de interessante acontece.", "No sucede nada interesante.");
   static Class45 aClass45_492 = new Class45("You can\'t reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l\'atteindre.", "Você não consegue alcançar isso.", "No puedes alcanzar eso.");
   static Class45 aClass45_491 = new Class45("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!", "¡Teletransporte no válido!");
   static Class45 aClass45_466 = new Class45("To go here you must login to a members\' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d\'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.", "Para entrar aquí, debes acceder a un servidor para miembros.");
   static Class45 aClass45_594 = new Class45("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d\'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.", "Sistema ocupado. No es posible añadir a un amigo.");
   static Class45 aClass45_627 = new Class45("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d\'ajouter l\'ami - joueur inconnu.", "Não foi possível adicionar esse amigo - jogador desconhecido.", "Jugador desconocido. No es posible añadir a ese amigo.");
   static Class45 aClass45_519 = new Class45("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d\'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.", "Sistema ocupado. No es posible añadir el nombre.");
   static Class45 aClass45_623 = new Class45("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d\'ajouter le nom - joueur inconnu.", "Não foi possível adicionar esse nome - jogador desconhecido.", "Jugador desconocido. No es posible añadir el nombre.");
   public static Class45 aClass45_526 = new Class45("Your friends list is full (400 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 400 erreicht.", "Votre liste d\'amis est pleine (400 noms maximum).", "Sua lista de amigos está cheia. O limite é de 400 nomes.", "Tu lista de amigos está llena. El límite es de 400 amigos.");
   public static Class45 aClass45_500 = new Class45("Your friends list is full (200 names maximum)", "Deine Freunde-Liste ist voll, du hast das Maximum von 200 erreicht.", "Votre liste d\'amis est pleine (200 noms maximum).", "Sua lista de amigos está cheia. O limite é de 200 nomes.", "Tu lista de amigos está llena. El límite es de 200 amigos.");
   static Class45 aClass45_501 = new Class45("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.", "Servidor ocupado. No es posible borrar al amigo.");
   static Class45 aClass45_502 = new Class45("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d\'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.", "Sistema ocupado. No es posible borrar el nombre.");
   static Class45 aClass45_589 = new Class45("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d\'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.", "Sistema ocupado. No es posible enviar el mensaje.");
   static Class45 aClass45_504 = new Class45("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d\'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.", "No es posible enviar el mensaje, el jugador no está disponible.");
   static Class45 aClass45_600 = new Class45((String)null, "der Spieler ist momentan nicht verfügbar.", (String)null, (String)null, (String)null);
   static Class45 aClass45_506 = new Class45("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d\'envoyer un message - joueur non inclus dans votre liste d\'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.", "No es posible enviar el mensaje. El jugador no está en tu lista de amigos.");
   static Class45 aClass45_507 = new Class45((String)null, "Spieler nicht auf deiner Freunde-Liste.", (String)null, (String)null, (String)null);
   static Class45 aClass45_508 = new Class45("You appear to be telling someone your password - please don\'t!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu\'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!", "Parece que le estás revelando a alguien tu contraseña. ¡No debes hacerlo!");
   static Class45 aClass45_558 = new Class45("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n\'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!", "¡Si no es así, cambia tu contraseña por una menos evidente!");
   static Class45 aClass45_510 = new Class45("Unable to send message - set your display name first by logging into the game.", "Nachricht konnte nicht gesendet werden.  Bitte richte erst deinen Charakternamen ein, ", "Impossible d\'envoyer le message - enregistrez un nom de personnage en vous connectant au jeu.", "Não é possível enviar a mensagem. Defina um nome de personagem primeiro, fazendo login no jogo.", "No es posible enviar el mensaje. Registra primero un nombre de personaje conectándote al juego.");
   static Class45 aClass45_515 = new Class45((String)null, "indem du dich ins Spiel einloggst.", (String)null, (String)null, (String)null);
   static Class45 aClass45_512 = new Class45("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n\'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.", "Sólo puedes denunciar por esa regla a jugadores que hayan hablado o comerciado recientemente.");
   static Class45 aClass45_513 = new Class45((String)null, "die kürzlich gesprochen oder gehandelt haben.", (String)null, (String)null, (String)null);
   static Class45 aClass45_574 = new Class45("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.", "Este jugador está desconectado o activó el modo de privacidad.");
   static Class45 aClass45_631 = new Class45("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d\'envoyer un message rapide à un joueur de ce serveur à l\'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.", "En estos momentos no puedes enviar un mensaje rápido de chat a un jugador en este mundo.");
   static Class45 aClass45_516 = new Class45((String)null, "geschickt werden.", (String)null, (String)null, (String)null);
   static Class45 aClass45_517 = new Class45("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.", "Este jugador no puede recibir su mensaje porque está en un mundo de chat rápido.");
   static Class45 aClass45_554 = new Class45("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado", "Chat desactivado");
   static Class45 aClass45_579 = new Class45("friends_chat", "friends_chat", "friends_chat", "friends_chat", "friends_chat");
   static Class45 aClass45_520 = new Class45("You are not currently in a friends chat channel.", "Du befindest dich derzeit nicht in einem Freundes-Chatraum.", "Vous ne faites pas partie d\'un canal de discussion.", "No momento, você não está no bate-papo entre amigos.", "Actualmente no estás en un canal de chat entre amigos.");
   static Class45 aClass45_521 = new Class45("You are not allowed to talk in this friends chat channel.", "Du darfst in diesem Freundes-Chatraum nicht reden.", "Vous n\'êtes pas autorisé à parler dans ce canal de discussion.", "Você não está autorizado a falar neste bate-papo entre amigos.", "No estás autorizado a hablar en este canal de chat entre amigos.");
   static Class45 aClass45_522 = new Class45("Error sending message to friends chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l\'envoi de ce message – veuillez réessayer ultérieurement !", "Erro ao enviar mensagem para bate-papo entre amigos - tente novamente mais tarde!", "Se ha producido un error al enviar un mensaje al chat entre amigos, por favor, inténtalo más tarde.");
   static Class45 aClass45_523 = new Class45("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d\'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.", "Por favor, espera hasta haberte desconectado del anterior chat.");
   static Class45 aClass45_524 = new Class45("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n\'êtes dans aucun canal à l\'heure actuelle.", "No momento você não está em um canal.", "En este momento no estás en un canal.");
   static Class45 aClass45_511 = new Class45("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...", "Intentando acceder a un canal...");
   static Class45 aClass45_493 = new Class45("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para sair do canal...", "Enviando solicitud para abandonar el canal...");
   static Class45 aClass45_527 = new Class45("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...", "Ya estás intentando unirte a un canal. Por favor, espera...");
   static Class45 aClass45_528 = new Class45("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...", "La salida del canal está procesándose. Por favor, espera...");
   static Class45 aClass45_599 = new Class45("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!", "¡Nombre de canal no valido!");
   static Class45 aClass45_532 = new Class45("Unable to join friends chat at this time - please try again later!", "Freundes-Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Vous ne pouvez pas rejoindre ce canal de discussion pour le moment - veuillez réessayer ultérieurement !", "Não foi possível entrar no bate-papo entre amigos - tente novamente mais tarde!", "Ahora mismo no es posible unirse al chat entre amigos. ¡Por favor, inténtalo más tarde!");
   static Class45 aClass45_531 = new Class45("Now talking in friends chat channel ", "Freundes-Chatraum: ", "Vous participez actuellement au canal de discussion : ", "Falando agora no bate-papo entre amigos: ", "Hablando ahora en el chat entre amigos: ");
   static Class45 aClass45_577 = new Class45("Now talking in friends chat channel of player: ", "Freundes-Chat dieses Spielers beigetreten: ", "Vous participez actuellement au canal de discussion du joueur : ", "Falando agora no bate-papo entre amigos do jogador: ", "Hablando ahora en el canal de chat entre amigos del jugador: ");
   static Class45 aClass45_533 = new Class45("Error joining friends chat channel - please try again later!", "Fehler beim Betreten des Freundes-Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de discussion - veuillez réessayer ultérieurement !", "Erro ao participar do bate-papo entre amigos - tente novamente mais tarde!", "Se ha producido un error al acceder al canal de chat entre amigos. ¡Por favor, inténtalo más tarde!");
   static Class45 aClass45_534 = new Class45("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente novamente mais tarde!", "De momento tienes bloqueado el acceso a los canales chat. ¡Inténtalo de nuevo más tarde!");
   static Class45 aClass45_535 = new Class45("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n\'existe pas.", "O canal que você tentou acessar não existe.", "El canal al que intentas unirte no existe.");
   static Class45 aClass45_536 = new Class45("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.", "El canal al que intentas unirte está lleno en estos momentos.");
   static Class45 aClass45_537 = new Class45("You do not have a high enough rank to join this friends chat channel.", "Dein Rang reicht nicht aus, um diesen Freundes-Chatraum zu betreten.", "Votre rang n\'est pas assez élevé pour rejoindre ce canal de discussion.", "Você não tem uma classificação alta o suficiente para participar deste bate-papo entre amigos.", "No tienes rango suficiente para unirte a este canal de chat entre amigos.");
   static Class45 aClass45_538 = new Class45("You are temporarily banned from this friends chat channel.", "Du wurdest temporär von diesem Freundes-Chatraum gesperrt.", "Vous avez été exclu temporairement de ce canal de discussion.", "Você foi temporariamente banido deste bate-papo entre amigos.", "Tienes bloqueado temporalmente el acceso a este chat entre amigos.");
   static Class45 aClass45_539 = new Class45("You are not allowed to join this user\'s friends chat channel.", "Du darfst den Freundes-Chatraum dieses Benutzers nicht betreten.", "Vous n\'êtes pas autorisé à rejoindre le canal de discussion de cet utilisateur.", "Você não pode entrar nesse bate-papo entre amigos deste usuário.", "No tienes permiso para acceder al canal de chat entre amigos de este usuario.");
   static Class45 aClass45_540 = new Class45(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.", " se ha unido al canal.");
   static Class45 aClass45_541 = new Class45(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " saiu do canal.", " ha abandonado el canal.");
   static Class45 aClass45_542 = new Class45(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.", " ha sido expulsado del canal.");
   static Class45 aClass45_543 = new Class45("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.", "Se te ha expulsado del canal.");
   static Class45 aClass45_544 = new Class45("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.", "Se te ha eliminado de este canal.");
   static Class45 aClass45_529 = new Class45("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.", "Has salido del canal.");
   static Class45 aClass45_633 = new Class45("Your friends chat channel has now been enabled!", "Dein Freundes-Chat ist jetzt eingeschaltet.", "Votre canal de discussion est maintenant activé !", "O seu bate-papo entre amigos foi ativado!", "¡Tu canal de chat entre amigos está activado!");
   static Class45 aClass45_547 = new Class45("Join your channel by clicking \'Join Chat\' and typing: ", "Klick auf \'Betreten\' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ", "Para entrar en tu canal, haz clic sobre \'Participar\' e introduce: ");
   static Class45 aClass45_462 = new Class45("Your friends chat channel has now been disabled!", "Dein Freundes-Chat ist jetzt ausgeschaltet.", "Votre canal de discussion est maintenant désactivé !", "O seu bate-papo entre amigos foi desativado!", "¡Tu canal de chat entre amigos ha sido desactivado!");
   static Class45 aClass45_496 = new Class45("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n\'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.", "No tienes autorización para expulsar a usuarios de este canal.");
   static Class45 aClass45_550 = new Class45("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n\'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.", "No tienes autorización para expulsar a este usuario.");
   static Class45 aClass45_551 = new Class45("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n\'est pas dans ce canal.", "Esse usuário não está no canal.", "Ese usuario no está en este canal.");
   static Class45 aClass45_566 = new Class45("Your request to kick/ban this user was successful.", "Der Rauswurf/die Sperrung war erfolgreich.", "Votre demande d\'exclusion de ce joueur a été acceptée.", "Seu pedido para expulsar/suspender este jogador foi bem sucedido.", "Tu petición de expulsar/suspender a este usuario ha sido aceptada.");
   static Class45 aClass45_525 = new Class45("Your request to refresh this user\'s temporary ban was successful.", "Die Verlängerung der temporären Sperrung dieses Spielers war erfolgreich.", "Le renouvellement d\'exclusion temporaire de ce joueur a été accepté.", "Seu pedido para reiniciar a suspensão temporária deste jogador foi bem sucedido.", "Tu petición de prolongar la suspensión temporal de este usuario ha sido aceptada.");
   static Class45 aClass45_549 = new Class45("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.", "Se te ha vetado temporalmente por haber violado una regla.");
   static Class45 aClass45_494 = new Class45("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ", "Este veto permancereá activo todavía durante ");
   static Class45 aClass45_556 = new Class45(" days.", " Tage.", " jours.", " dias.", " días.");
   static Class45 aClass45_555 = new Class45("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.", "Tu veto se retirará dentro de las próximas 24 horas.");
   static Class45 aClass45_573 = new Class45("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.", "Para evitar otro veto, consulta el reglamento.");
   static Class45 aClass45_559 = new Class45("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L\'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.", "Se te ha vetado permanentemente por haber violado una regla.");
   public static Class45 aClass45_560 = new Class45("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.", "Cargando. Por favor, espera.");
   public static Class45 aClass45_604 = new Class45("Profiling...", "Profiling...", "Profilage...", "Definindo perfil...", "Obteniendo perfil...");
   public static Class45 aClass45_562 = new Class45("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.", "Conexión perdida.");
   public static Class45 aClass45_563 = new Class45("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.", "Estamos intentando restablecer la conexión. Por favor, espera.");
   public static Class45 aClass45_564 = new Class45("Checking for updates", "Suche nach Updates", "Vérification des mises à jour", "Verificando atualizações", "Buscando actualizaciones");
   public static Class45 aClass45_565 = new Class45("Fetching Updates", "Lade Update", "Chargement des MAJ", "Carregando atualizações", "Cargando actualizaciones");
   static Class45 aClass45_509 = new Class45("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ", "Cargando configuración - ");
   static Class45 aClass45_567 = new Class45("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada", "Configuración cargada");
   static Class45 aClass45_557 = new Class45("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ", "Cargando sprites - ");
   static Class45 aClass45_569 = new Class45("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados", "Sprites cargados");
   static Class45 aClass45_570 = new Class45("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ", "Cargando el módulo de texto - ");
   static Class45 aClass45_481 = new Class45("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado", "Módulo de texto cargado");
   static Class45 aClass45_572 = new Class45("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ", "Cargando interfaces - ");
   static Class45 aClass45_575 = new Class45("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas", "Interfaces cargadas");
   static Class45 aClass45_610 = new Class45("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando scripts de interface - ", "Cargando guión de interfaz - ");
   static Class45 aClass45_495 = new Class45("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Script de interface carregados", "Guiones de interfaz cargados");
   static Class45 aClass45_576 = new Class45("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes adicionais - ", "Cargando fuentes adicionales - ");
   static Class45 aClass45_586 = new Class45("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes adicionais carregadas", "Fuentes adicionales cargadas");
   static Class45 aClass45_578 = new Class45("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ", "Cargando mapamundi - ");
   static Class45 aClass45_514 = new Class45("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado", "Mapamundi cargado");
   static Class45 aClass45_580 = new Class45("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos", "Cargando datos de la lista de mundos");
   static Class45 aClass45_581 = new Class45("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados", "Datos de la lista de mundos cargados");
   static Class45 aClass45_582 = new Class45("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas", "Variables de cliente cargadas");
   public static Class45 aClass45_583 = new Class45("Loading...", "Lade...", "Chargement en cours...", "Carregando...", "Cargando...");
   static Class45 aClass45_478 = new Class45("Please close the interface you have open before using \'Report Abuse\'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l\'interface que vous avez ouverte avant d\'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", "Cierra la interfaz que tienes abierta antes de usar el botón \'Denunciar abuso\'.");
   static Class45 aClass45_585 = new Class45((String)null, "bevor du die Option \'Regelverstoß melden\' benutzt.", (String)null, (String)null, (String)null);
   static Class45 aClass45_470 = new Class45("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ", "Actualización del sistema en: ");
   public static Class45 aClass45_467 = new Class45(" has logged in.", " loggt sich ein.", " s\'est connecté.", " entrou no jogo.", " se ha conectado.");
   public static Class45 aClass45_588 = new Class45(" has logged out.", " loggt sich aus.", " s\'est déconnecté.", " saiu do jogo.", " se ha desconectado.");
   public static Class45 aClass45_587 = new Class45("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não foi possível encontrar ", "No es posible encontrar a ");
   static Class45 aClass45_590 = new Class45("Use", "Benutzen", "Utiliser", "Usar", "Usar");
   public static Class45 aClass45_591 = new Class45("Examine", "Untersuchen", "Examiner", "Examinar", "Examinar");
   public static Class45 aClass45_592 = new Class45("Attack", "Angreifen", "Attaquer", "Atacar", "Atacar");
   public static Class45 aClass45_545 = new Class45("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção", "Seleccionar opción");
   public static Class45 aClass45_518 = new Class45(" more options", " weitere Optionen", " autres options", " mais opções", " más opciones");
   public static Class45 aClass45_471 = new Class45("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá", "Venir acá");
   public static Class45 aClass45_613 = new Class45("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá", "Girar hacia acá");
   public static Class45 aClass45_597 = new Class45("level: ", "Stufe: ", "niveau ", "nível: ", "nivel: ");
   public static Class45 aClass45_598 = new Class45("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ", "habilidad: ");
   public static Class45 aClass45_548 = new Class45("rating: ", "Kampfstufe: ", "classement ", "qualificação: ", "clasificación: ");
   public static Class45 aClass45_596 = new Class45("Please wait...", "Bitte warte...", "Veuillez attendre", "Aguarde...", "Por favor, espera...");
   static Class45 aClass45_601 = new Class45("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l\'interface que vous avez ouverte avant d\'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".", "Cierra la interfaz que tienes abierta antes de usar el botón \'Denunciar abuso\'.");
   public static Class45 aClass45_602 = new Class45(" ", ": ", " ", " ", " ");
   public static Class45 aClass45_603 = new Class45("M", "M", "M", "M", "M");
   public static Class45 aClass45_552 = new Class45("M", "M", "M", "M", "M");
   public static Class45 aClass45_605 = new Class45("K", "T", "K", "K", "K");
   public static Class45 aClass45_606 = new Class45("K", "T", "K", "K", "K");
   static Class45 aClass45_607 = new Class45("From", "Von:", "De", "De", "De");
   public static Class45 aClass45_608 = new Class45("Self", "Mich", "Moi", "Eu", "Mí");
   public static Class45 aClass45_595 = new Class45(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d\'amis.", " já está na sua lista de amigos.", " ya está en tu lista de amigos.");
   public static Class45 aClass45_584 = new Class45("Your ignore list is full. Max of 400 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 400 Spieler darauf eintragen.", "Votre liste noire est pleine (400 noms maximum).", "Sua lista de ignorados está cheia. O limite é de 400 usuários.", "Tu lista de jugadores ignorados está llena, el límite es de 400.");
   public static Class45 aClass45_611 = new Class45("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é de 100 usuários.", "Tu lista de jugadores ignorados está llena, el límite es de 100.");
   public static Class45 aClass45_612 = new Class45(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.", " ya está en tu lista de ignorados.");
   public static Class45 aClass45_483 = new Class45("You can\'t add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d\'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.", "No puedes añadirte a tu propia lista de amigos.");
   public static Class45 aClass45_614 = new Class45("You can\'t add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.", "No puedes añadirte a tu propia lista de ignorados.");
   static Class45 aClass45_615 = new Class45("Changes will take effect on your friends chat in the next 60 seconds.", "Die Änderungen am Freundes-Chat werden innerhalb von 60 Sekunden übernommen.", "Les modifications seront apportées à votre canal de discussion dans les 60 prochaines secondes.", "As mudanças acontecerão em seu bate-papo entre amigos nos próximos 60 segundos.", "Los cambios en tu chat de amigos se realizarán en los próximos 60 segundos.");
   public static Class45 aClass45_616 = new Class45("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");
   public static Class45 aClass45_622 = new Class45(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.", " de tu lista de ignorados.");
   public static Class45 aClass45_618 = new Class45("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ", "Elimina primero a ");
   public static Class45 aClass45_619 = new Class45(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d\'amis.", " da sua lista de amigos primeiro.", " de tu lista de amigos.");
   public static Class45 aClass45_620 = new Class45("yellow:", "gelb:", "jaune:", "amarelo:", "amarillo:");
   public static Class45 aClass45_593 = new Class45("red:", "rot:", "rouge:", "vermelho:", "rojo:");
   public static Class45 aClass45_568 = new Class45("green:", "grün:", "vert:", "verde:", "verde:");
   public static Class45 aClass45_477 = new Class45("cyan:", "blaugrün:", "cyan:", "ciano:", "cian:");
   public static Class45 aClass45_624 = new Class45("purple:", "lila:", "violet:", "roxo:", "violeta:");
   public static Class45 aClass45_625 = new Class45("white:", "weiss:", "blanc:", "branco:", "blanco:");
   public static Class45 aClass45_626 = new Class45("flash1:", "blinken1:", "clignotant1:", "flash1:", "parpadeante1:");
   public static Class45 aClass45_546 = new Class45("flash2:", "blinken2:", "clignotant2:", "flash2:", "parpadeante2:");
   public static Class45 aClass45_628 = new Class45("flash3:", "blinken3:", "clignotant3:", "flash3:", "parpadeante3:");
   public static Class45 aClass45_629 = new Class45("glow1:", "leuchten1:", "brillant1:", "brilho1:", "brillante1:");
   public static Class45 aClass45_630 = new Class45("glow2:", "leuchten2:", "brillant2:", "brilho2:", "brillante2:");
   public static Class45 aClass45_497 = new Class45("glow3:", "leuchten3:", "brillant3:", "brilho3:", "brillante3:");
   public static Class45 aClass45_632 = new Class45("wave:", "welle:", "ondulation:", "onda:", "onda:");
   public static Class45 aClass45_475 = new Class45("wave2:", "welle2:", "ondulation2:", "onda2:", "onda2:");
   public static Class45 aClass45_634 = new Class45("shake:", "schütteln:", "tremblement:", "tremor:", "temblor:");
   public static Class45 aClass45_635 = new Class45("scroll:", "scrollen:", "déroulement:", "rolagem:", "desplazar:");
   public static Class45 aClass45_636 = new Class45("slide:", "gleiten:", "glissement:", "deslizamento:", "deslizar:");
   static Class45 aClass45_637 = new Class45("Friend", "Freund", "Ami", "Amigo", "Amigo");
   Map aMap638 = new HashMap(7);

   public String method920(Class673 var1, int var2) {
      return (String)this.aMap638.get(var1);
   }

   static final void method921(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      if(var2 > 700 || var3 > 700) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 256;
      }

      double var4 = (Math.random() * (double)(var2 + var3) - (double)var2 + 800.0D) / 100.0D;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = (int)(Math.pow(2.0D, var4) + 0.5D);
   }

   static void method922(Class700 var0, int var1) {
      Class203.aClass700_2214 = var0;
      Class202.aString2212 = null;
   }

   Class45(String var1, String var2, String var3, String var4, String var5) {
      this.aMap638.put(Class673.aClass673_8579, var1);
      this.aMap638.put(Class673.aClass673_8573, var2);
      this.aMap638.put(Class673.aClass673_8570, var3);
      this.aMap638.put(Class673.aClass673_8571, var4);
      this.aMap638.put(Class673.aClass673_8574, var5);
   }

   static final void method923(Class681 var0, int var1) {
      Class230.preferences.method9602(Class230.preferences.aClass711_Sub12_10613, var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], (short)-27752);
      Class522.method6257(-1042127423);
      client.aBool11013 = false;
   }

   static final void method924(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class501.method6014(var3, var4, var0, 142471188);
   }

   public static Connection method925(Socket var0, int var1, int var2) throws IOException {
      return new Class560_Sub1(var0, var1);
   }

   public static void method926(int var0) {
      if(102 == Class32.anInt341 * -1216905875) {
         Class32.anInt341 = -1968237318;
      }
   }
}
