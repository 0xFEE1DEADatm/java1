public class IntContainer {
    private int[] elements;
    private int size;

    /**
     * Создает новый экземпляр класса IntContainer с начальным размером 10.
     */
    public IntContainer() {
        elements = new int[10];
        size = 0;
    }

    /**
     * Добавляет элемент в контейнер.
     *
     * @param element Элемент, который нужно добавить.
     */
    public void add(int element) {
        if (size == elements.length) {
            int[] newElements = new int[size * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size] = element;
        size++;
    }

    /**
     * Возвращает элемент по индексу.
     *
     * @param index Индекс элемента.
     * @return Элемент по указанному индексу.
     * @throws IndexOutOfBoundsException если индекс выходит за границы контейнера.
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements[index];
    }

    /**
     * Удаляет элемент по индексу.
     *
     * @param index Индекс элемента, который нужно удалить.
     * @throws IndexOutOfBoundsException если индекс выходит за границы контейнера.
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }
}