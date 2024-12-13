package com.company;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Location;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MyBot extends TelegramLongPollingBot {
    BotButton button = new BotButton();
    CRUD crud = new CRUD();
    Long chatIdAdmin = 6843496663L;


    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {

//        System.out.println(update.getMessage().getFrom().getId());
//        System.out.println(update.getMessage().getPhoto());
        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            String[] words = text.split(" ");

            if (text.equals("/start")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Assalomu alaykum! Chopar Pizza yetkazib berish xizmatiga xush kelibsiz.\n" +
                        "\n" +
                        "Здравствуйте! Добро пожаловать в службу доставки Chopar Pizza.\n" +
                        "\n" +
                        "Hello! Welcome to Chopar Pizza delivery service.");
                sendMessage.setReplyMarkup(button.replay());
                execute(sendMessage);
            } else if (text.equals("Toshkent")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Bosh menu");
                sendMessage.setReplyMarkup(button.replyKeyboardMarkup());
                execute(sendMessage);
            } else if (text.equals("Buyurma berish")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Buyurtmani o'zingiz \uD83D\uDE4B\u200D♂\uFE0F " +
                        "olib keting yoki Yetkazib berishni \uD83D\uDE99 tanlang");
                sendMessage.setReplyMarkup(button.replay1());
                execute(sendMessage);
            } else if (text.equals("Olib ketish")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Buyurtmangizni qayerga yetkazib berish kerak \uD83D\uDE99? Agar lokatsiyangizni\uD83D\uDCCD " +
                        "yuborsangiz, sizga eng yaqin filialni aniqlaymiz.");
                sendMessage.setReplyMarkup(button.replay3());
                execute(sendMessage);
            } else if (text.equals("Yetkazib berish\uD83D\uDE97")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Buyurtmangizni qayerga yetkazib berish kerak \uD83D\uDE99? Agar lokatsiyangizni\uD83D\uDCCD " +
                        "yuborsangiz, sizga eng yaqin filialni aniqlaymiz.");
                sendMessage.setReplyMarkup(button.replay2());
                execute(sendMessage);
            } else if (text.equals("⬅\uFE0Fortga")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Buyurtmangizni qayerga yetkazib berish kerak \uD83D\uDE99? Agar lokatsiyangizni\uD83D\uDCCD " +
                        "yuborsangiz, sizga eng yaqin filialni aniqlaymiz.");
                sendMessage.setReplyMarkup(button.replyKeyboardMarkup());
                execute(sendMessage);
            } else if (text.equals("Bu yerda buyurtma berish \uD83C\uDF10")) {
                SendPhoto photo = new SendPhoto();
                photo.setPhoto(new InputFile("AgACAgIAAxkBAAIBOGdb1Ll7qcx9ZdXNhiNMO_pLi_vbAAKN4jEbB9jgSi7itNTLyqlMAQADAgADcwADNgQ"));
                photo.setCaption("3+1 VEGETARIAN LAVASH\n" +
                        "4 ta Vegetarian lavashi 3 tasini narxida" +
                        "75 000 so'm");
                photo.setChatId(chatId);
                photo.setPhoto(new InputFile("AgACAgIAAxkBAAIBQGdb2IsIkzojgRr6YUZ2dRL3X9AiAAKt4jEbB9jgSrDgS3fwZ1ebAQADAgADcwADNgQ"));
                photo.setCaption("YANGI MUMTOZ SET\n" +
                        "Ikki karra pepperoni 25 sm\n" +
                        "\n" +
                        "Julyen 25 sm\n" +
                        "\n" +
                        "Barbekyu 25 sm\n" +
                        "\n" +
                        "Coca-cola 1.5 L\n" +
                        "\n" +
                        "10% chegirma\n" +
                        "\n" +
                        "158 000 so'm");
                photo.setChatId(chatId);
                execute(photo);
            } else if (text.equals("Fillialarni tanlang")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Qaysi filialdan olib ketishni tanlang");
                sendMessage.setReplyMarkup(button.replay4());
                execute(sendMessage);
            } else if (text.equals("Atlas chimgan")) {
                Location location = new Location();
                double latitude = 41.3538889;
                double longitude = 69.3541667;
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Atlas Chimgan\n" +
                        "\uD83D\uDCF1 712051111\n" +
                        "Ish vaqti:\n" +
                        "10:00 – 22:00\n" +
                        "Toshkent shahri, M.Ulug’bek tumani.\n" +
                        "Mo’ljal: «Atlas Chimgan» savdo markaz\n" +
                        "\uD83D\uDE97 yetkazish xizmati\n" +
                        "\uD83C\uDFF0 bolalar maydonchasi\n" +
                        "\uD83C\uDD7F\uFE0F avtoturargoh");
                sendMessage.setReplyMarkup(button.replayLocation());
                execute(sendMessage);
            } else if (text.equals("Sergili 2")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Sergerli 2\n" +
                        "\uD83D\uDCF1 712051111\n" +
                        "Ish vaqti:\n" +
                        "10:00 – 22:00\n" +
                        "Toshkent shahri, Sergeli tumani.\n" +
                        "Mo’ljal: Golden life savdo markazi\n" +
                        "\uD83D\uDE97 yetkazish xizmati\n" +
                        "\uD83C\uDFF0 bolalar maydonchasi\n" +
                        "\uD83C\uDD7F\uFE0F avtoturargoh");
                sendMessage.setReplyMarkup(button.replayLocation());
                execute(sendMessage);
            } else if (text.equals("Oybek")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Oybek\n" +
                        "\uD83D\uDCF1712051111\n" +
                        "Ish vaqti:\n" +
                        "10:00 – 03:00\n" +
                        "Toshkent shahri, Shahrisabz ko‘chasi, 10b\n" +
                        "\uD83D\uDE97 yetkazish xizmati\n" +
                        "\uD83C\uDD7F\uFE0F avtoturargoh");
                sendMessage.setReplyMarkup(button.replayLocation());
                execute(sendMessage);
            } else if (text.equals("Buyuk ipak yo'li")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Buyuk ipak yo‘li\n" +
                        "\uD83D\uDCF1 712051111\n" +
                        "Ish vaqti:\n" +
                        "10:00 – 03:00\n" +
                        "Toshkent shahri, M.Ulug’bek tumani, Buyuk Ipak yo’li 123\n" +
                        "Mo’ljal: «Makro Sayohat»\n" +
                        "\uD83D\uDE97 yetkazish xizmati\n" +
                        "\uD83C\uDD7F\uFE0F avtoturargoh");
                sendMessage.setReplyMarkup(button.replayLocation());
                execute(sendMessage);
            }else if (words[0].equals("/list")) {
                    String product = crud.getEmployees();
                    SendMessage sendMessage = SendMessage.builder()
                            .chatId(chatId)
                            .text(product)
                            .build();
                    execute(sendMessage);

            } else if (words[0].equals("/add")) {
                crud.create(words[1], Double.parseDouble(words[2]), words[3], words[4], words[5]);
            } else if (words[0].equals("/delete")) {
                crud.delete(Integer.parseInt((words[1])));
            } else if (words[0].equals("/update")) {
                crud.update(words[1], Double.parseDouble(words[2]), Integer.parseInt(words[3]));
            } else if (text.equals("\uD83D\uDCD6Buyurtmalar tarixi")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Sizda hozircha sizda hech" +
                        "qanday buyurtma yoq❌");
                execute(sendMessage);
            } else if (text.equals("Chopar bilan aloqa")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Agar siz bizga yozsangiz yoki sharh qoldirmoqchi bo'lsangiz, xursand bo'lamiz\uD83D\uDE09");
                sendMessage.setReplyMarkup(button.replay5());
                execute(sendMessage);
            } else if (text.equals("\uD83D\uDCACBiz bilan aloqaga chiqing")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Agar biron-bir savol yoki taklif bo'lsa, bizga aloqaga chiqing.");
                sendMessage.setReplyMarkup(button.markup());
                execute(sendMessage);
            } else if (text.equals("✍\uFE0F Fikr bildirish")) {
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Agar biron-bir savol yoki taklif bo'lsa, bizga aloqaga chiqing.");
                sendMessage.setReplyMarkup(button.markup1());
                execute(sendMessage);
            } else if (text.equals("Pitsa\uD83C\uDF55")) {
                for (int i = 1; i < 5; i++) {
                    SendPhoto photo = new SendPhoto();
                    photo.setPhoto(new InputFile("AgACAgIAAxkBAAIBOGdb1Ll7qcx9ZdXNhiNMO_pLi_vbAAKN4jEbB9jgSi7itNTLyqlMAQADAgADcwADNgQ"));
                    photo.setCaption("3+1 VEGETARIAN LAVASH\n" +
                            "4 ta Vegetarian lavashi 3 tasini narxida" +
                            "75 000 so'm");
                    photo.setChatId(chatId);
                    photo.setPhoto(new InputFile("AgACAgIAAxkBAAIBQGdb2IsIkzojgRr6YUZ2dRL3X9AiAAKt4jEbB9jgSrDgS3fwZ1ebAQADAgADcwADNgQ"));
                    photo.setCaption("YANGI MUMTOZ SET\n" +
                            "Ikki karra pepperoni 25 sm\n" +
                            "\n" +
                            "Julyen 25 sm\n" +
                            "\n" +
                            "Barbekyu 25 sm\n" +
                            "\n" +
                            "Coca-cola 1.5 L\n" +
                            "\n" +
                            "10% chegirma%\n" +
                            "\n" +
                            "158 000 so'm");
                    photo.setChatId(chatId);
                    execute(photo);
                }
            }else if (text.equals("\uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0FJamoamizga qo'shiling")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Agar biron-bir savol yoki taklif bo'lsa, bizga aloqaga chiqing.");
                sendMessage.setReplyMarkup(button.markup1());
                execute(sendMessage);
            }
            if (update.hasMessage()) {
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "@vazifabotbotbot";
    }

    @Override
    public String getBotToken() {
        return "8166890282:AAEggsHlqY1oO7xU2mDjSWOidNbrbIrLbZ4";
    }
}