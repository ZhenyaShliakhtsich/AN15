package com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.service;

import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.PurchaseReceipt;
import com.teachMeSkills.an15.VorobyovSergey.hwSeven.Task2.model.User;

public interface PurchaseService {
    void savePurchaseReceipt(PurchaseReceipt purchaseReceipt);
    void showUserReceipts (User user, String dir);
}
