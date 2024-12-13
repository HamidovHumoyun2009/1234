package com.company;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import java.util.ArrayList;
import java.util.List;

public class BotButton {

    public ReplyKeyboardMarkup replay(){
        KeyboardRow row = new KeyboardRow();
        row.add("Toshkent");
        row.add("Sirdaryo");
        row.add("Samarqand");
        List<KeyboardRow> markupList = new ArrayList<>();
        markupList.add(row);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(markupList);
        markup.setResizeKeyboard(true);
        return markup;
    }



    public ReplyKeyboardMarkup replyKeyboardMarkup(){
        KeyboardRow row = new KeyboardRow();
        row.add("Buyurma berish");
        KeyboardRow row1 = new KeyboardRow();
        row1.add("\uD83D\uDCD6Buyurtmalar tarixi");
        row1.add("Chopar bilan aloqa\uD83D\uDCDE");
        KeyboardRow row2 = new KeyboardRow();
        row2.add("Sozlash  ℹ\uFE0F malumot");
        row2.add("\uD83D\uDE4B\uD83C\uDFFB\u200D♂\uFE0FJamoamizga qo'shiling");
        List<KeyboardRow> markupList = new ArrayList<>();
        markupList.add(row);
        markupList.add(row1);
        markupList.add(row2);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(markupList);
        markup.setResizeKeyboard(true);
        return markup;
    }

    public ReplyKeyboardMarkup replay1(){
        KeyboardRow row = new KeyboardRow();
        row.add("Olib ketish");
        row.add("Yetkazib berish\uD83D\uDE97");
        KeyboardRow row1 = new KeyboardRow();
        row1.add("⬅\uFE0Fortga");
        List<KeyboardRow> markupList = new ArrayList<>();
        markupList.add(row);
        markupList.add(row1);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(markupList);
        markup.setResizeKeyboard(true);
        return markup;
    }
    public ReplyKeyboardMarkup replay2(){
        KeyboardRow row = new KeyboardRow();
        row.add("Eng yaqin fillial");
        KeyboardRow row1 = new KeyboardRow();
        row1.add("Men turgan manzil");
        row1.add("⬅\uFE0Fortga");
        List<KeyboardRow> markupList = new ArrayList<>();
        markupList.add(row);
        markupList.add(row1);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(markupList);
        markup.setResizeKeyboard(true);
        return markup;
    }
    public ReplyKeyboardMarkup replay3(){
        KeyboardRow row = new KeyboardRow();
        row.add("Eng yaqin fillialari aniqlash");
        row.add("Bu yerda buyurtma berish \uD83C\uDF10");
        KeyboardRow row1 = new KeyboardRow();
        row1.add("Fillialarni tanlang");
        row1.add("⬅\uFE0Fortga");
        List<KeyboardRow> markupList = new ArrayList<>();
        markupList.add(row);
        markupList.add(row1);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(markupList);
        markup.setResizeKeyboard(true);
        return markup;
    }

    public ReplyKeyboardMarkup replay4(){
        KeyboardRow row = new KeyboardRow();
        row.add("Atlas chimgan");
        row.add("Sergili 2");
        KeyboardRow row1 = new KeyboardRow();
        row1.add("Oybek");
        row1.add("Buyuk ipak yo'li");
        KeyboardRow row2 = new KeyboardRow();
        row2.add("⬅\uFE0Fortga");
        List<KeyboardRow> markupList = new ArrayList<>();
        markupList.add(row);
        markupList.add(row1);
        markupList.add(row2);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(markupList);
        markup.setResizeKeyboard(true);
        return markup;
    }

    public ReplyKeyboardMarkup replayLocation(){
        KeyboardRow row = new KeyboardRow();
        row.add("Pitsa\uD83C\uDF55");
        row.add("Savat\uD83D\uDED2");
        KeyboardRow row1 = new KeyboardRow();
        row1.add("Pide va lavsh\uD83C\uDF2F");
        row1.add("Setlar");
        KeyboardRow row2 = new KeyboardRow();
        row2.add("⬅\uFE0Fortga");
        List<KeyboardRow> markupList = new ArrayList<>();
        markupList.add(row);
        markupList.add(row1);
        markupList.add(row2);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(markupList);
        markup.setResizeKeyboard(true);
        return markup;
    }

    public ReplyKeyboardMarkup replay5(){
        KeyboardRow row = new KeyboardRow();
        row.add("\uD83D\uDCACBiz bilan aloqaga chiqing");
        row.add("✍\uFE0F Fikr bildirish");
        KeyboardRow row1 = new KeyboardRow();
        row1.add("⬅\uFE0Fortga");
        List<KeyboardRow> markupList = new ArrayList<>();
        markupList.add(row);
        markupList.add(row1);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(markupList);
        markup.setResizeKeyboard(true);
        return markup;
    }

    public InlineKeyboardMarkup markup() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("\uD83D\uDCAC Biz bilan aloqaga chiqing");
        button.setCallbackData("aloqa\uD83D\uDCDE ");

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(button);

        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(row1);

        inlineKeyboardMarkup.setKeyboard(keyboard);

        return inlineKeyboardMarkup;
    }

    public InlineKeyboardMarkup markup1() {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();

        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText("Mahsulot");
        button.setCallbackData("product");

        List<InlineKeyboardButton> row1 = new ArrayList<>();
        row1.add(button);

        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();
        keyboard.add(row1);

        inlineKeyboardMarkup.setKeyboard(keyboard);

        return inlineKeyboardMarkup;
    }
}