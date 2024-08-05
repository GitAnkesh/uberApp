package com.ankesh.project.uber.uberApp.services;

import com.ankesh.project.uber.uberApp.dto.WalletTransactionDto;
import com.ankesh.project.uber.uberApp.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);

}
