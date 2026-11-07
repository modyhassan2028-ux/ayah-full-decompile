package io.realm;

import io.realm.internal.OsList;
import p123m2.c;

/* JADX INFO: loaded from: classes.dex */
abstract class ManagedListOperator<T> {
    static final String INVALID_OBJECT_TYPE_MESSAGE = "Unacceptable value type. Acceptable: %1$s, actual: %2$s .";
    static final String NULL_OBJECTS_NOT_ALLOWED_MESSAGE = "RealmList does not accept null values.";
    final Class<T> clazz;
    final OsList osList;
    final BaseRealm realm;

    public ManagedListOperator(BaseRealm baseRealm, OsList osList, Class<T> cls) {
        this.realm = baseRealm;
        this.clazz = cls;
        this.osList = osList;
    }

    private void appendNull() {
        this.osList.addNull();
    }

    public final void append(Object obj) {
        checkValidValue(obj);
        if (obj == null) {
            appendNull();
        } else {
            appendValue(obj);
        }
    }

    public abstract void appendValue(Object obj);

    public void checkInsertIndex(int i10) {
        int size = size();
        if (i10 < 0 || size < i10) {
            StringBuilder sbW = c.w(i10, "Invalid index ", ", size is ");
            sbW.append(this.osList.size());
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    public abstract void checkValidValue(Object obj);

    public final void delete(int i10) {
        this.osList.delete(i10);
    }

    public final void deleteAll() {
        this.osList.deleteAll();
    }

    public final void deleteLast() {
        OsList osList = this.osList;
        osList.delete(osList.size() - 1);
    }

    public abstract boolean forRealmModel();

    public abstract T get(int i10);

    public final OsList getOsList() {
        return this.osList;
    }

    public final void insert(int i10, T t2) {
        checkValidValue(t2);
        if (t2 == null) {
            insertNull(i10);
        } else {
            insertValue(i10, t2);
        }
    }

    public void insertNull(int i10) {
        this.osList.insertNull(i10);
    }

    public abstract void insertValue(int i10, Object obj);

    public final boolean isEmpty() {
        return this.osList.isEmpty();
    }

    public final boolean isValid() {
        return this.osList.isValid();
    }

    public final void move(int i10, int i11) {
        this.osList.move(i10, i11);
    }

    public final void remove(int i10) {
        this.osList.remove(i10);
    }

    public final void removeAll() {
        this.osList.removeAll();
    }

    public final T set(int i10, Object obj) {
        checkValidValue(obj);
        T t2 = get(i10);
        if (obj == null) {
            setNull(i10);
            return t2;
        }
        setValue(i10, obj);
        return t2;
    }

    public void setNull(int i10) {
        this.osList.setNull(i10);
    }

    public abstract void setValue(int i10, Object obj);

    public final int size() {
        long size = this.osList.size();
        if (size < 2147483647L) {
            return (int) size;
        }
        return Integer.MAX_VALUE;
    }
}
