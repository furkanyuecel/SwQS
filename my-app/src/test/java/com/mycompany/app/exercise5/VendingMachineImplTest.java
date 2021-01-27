package com.mycompany.app.exercise5;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class VendingMachineImplTest {
    private VendingMachineImpl vendingMachine;
    private FullBox fullBox1;
    private FullBox fullBox2;
    private UnlimitedCashBox unlimitedCashBox;

    @Before
    public void setUp() {
        unlimitedCashBox = spy(UnlimitedCashBox.class);
        fullBox1 = spy(FullBox.class);
        fullBox2 = spy(FullBox.class);
        Box[] boxArray = {fullBox1, fullBox2};
        vendingMachine = new VendingMachineImpl(unlimitedCashBox, boxArray);
    }
    @Test
    public void testEnoughMoney() throws BoxEmptyException, NotEnoughMoneyException {
        vendingMachine.selectItem(1);

        verify(fullBox2).getPrice();
        verify(unlimitedCashBox).getCurrentAmount();

    }
}