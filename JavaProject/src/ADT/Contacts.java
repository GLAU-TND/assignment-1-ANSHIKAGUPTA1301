package ADT;

public interface Contacts<E> 
{
	void add(E item);
	E remove();
	E getData(int index);

}
