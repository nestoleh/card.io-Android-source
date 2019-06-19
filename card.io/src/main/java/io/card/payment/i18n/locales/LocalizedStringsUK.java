package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

public class LocalizedStringsUK implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<>();
    private static Map<String, String> mAdapted = new HashMap<>();

    @Override
    public String getName() {
        return "uk";
    }

    @Override
    public String getAdaptedDisplay(StringKey key, String country) {
        String adaptedKey = key.toString() + "|" + country;
        if (mAdapted.containsKey(adaptedKey)) {
            return mAdapted.get(adaptedKey);
        } else {
            return mDisplay.get(key);
        }
    }

    public LocalizedStringsUK() {
        mDisplay.put(StringKey.CANCEL, "Відміна");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "Готово");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Індекс");
        mDisplay.put(StringKey.ENTRY_CARDHOLDER_NAME, "Ім\'я та прізвище власника");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Дійсна до");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "ММ/РР");
        mDisplay.put(StringKey.SCAN_GUIDE, "Тримайте картку всередині рамки.\nВона буде зчитана автоматично.");
        mDisplay.put(StringKey.KEYBOARD, "Клавіатура…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Номер картки");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Ввести дані вручну");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "У цьому пристрої немає опції зчитування номера карти за допомогою фотокамери.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Фотокамера пристрою недоступна.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Виникла неочікувана помилка при відкритті фотокамери пристрою.");
    }
}
