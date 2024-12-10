package org.oodp._08_factory_method.ex03;

abstract class PaymentFactory {
    abstract Payment createPayment(FinancialInfo info);
}