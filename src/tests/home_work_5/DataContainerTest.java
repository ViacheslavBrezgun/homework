package tests.home_work_5;

import home_work_5.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class DataContainerTest {

        @Test
        public void addElement() {
            DataContainer container =
                    new DataContainer(new Integer[]{1, 2, 3, null, null, null});

            int idx = container.add(777);
            Assertions.assertEquals(3, idx);
        }

        @Test
        public void addNull() {
            DataContainer container =
                    new DataContainer(new Integer[]{1, 2, 3, null, null, null});

            int idx = container.add(null);
            Assertions.assertEquals(-1, idx);
        }

        @Test
        public void addToMid() {
            DataContainer container =
                    new DataContainer(new Integer[]{1, null, 3, null, null, null});

            int idx = container.add(777);

            Assertions.assertEquals(1, idx);

        }

        @Test
        public void addOneElementToNotEmptyContainer() {
            DataContainer container =
                    new DataContainer(new Integer[]{1, 2, 3});
            int idx = container.add(777);
            Assertions.assertEquals(777, container.get(idx));
        }

    }

