package io.realm;

import io.realm.internal.InvalidRow;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import io.realm.internal.core.NativeRealmAny;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import p245z2.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class OrderedRealmCollectionImpl<E> extends AbstractList<E> implements OrderedRealmCollection<E> {
    private static final String NOT_SUPPORTED_MESSAGE = "This method is not supported by 'RealmResults' or 'OrderedRealmCollectionSnapshot'.";
    public final BaseRealm baseRealm;
    final String className;
    final Class<E> classSpec;
    final CollectionOperator<E> operator;
    final OsResults osResults;

    public static class ByteValueOperator extends PrimitiveValueOperator<Byte> {
        public ByteValueOperator(BaseRealm baseRealm, OsResults osResults, Class<Byte> cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public Byte get(int i10) {
            return Byte.valueOf(((Long) this.osResults.getValue(i10)).byteValue());
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public Byte getFromResults(int i10, OsResults osResults) {
            Long l10 = (Long) osResults.getValue(i10);
            if (l10 == null) {
                return null;
            }
            return Byte.valueOf(l10.byteValue());
        }
    }

    public static abstract class CollectionOperator<T> {
        protected final BaseRealm baseRealm;
        protected final String className;
        protected final Class<T> classSpec;
        protected final OsResults osResults;

        public CollectionOperator(BaseRealm baseRealm, OsResults osResults, Class<T> cls, String str) {
            this.baseRealm = baseRealm;
            this.osResults = osResults;
            this.classSpec = cls;
            this.className = str;
        }

        public abstract T convertRowToObject(UncheckedRow uncheckedRow);

        public T convertToObject(UncheckedRow uncheckedRow, boolean z10, T t2) {
            if (uncheckedRow != null) {
                return (T) this.baseRealm.get(this.classSpec, this.className, uncheckedRow);
            }
            if (z10) {
                throw new IndexOutOfBoundsException("No results were found.");
            }
            return t2;
        }

        public abstract T firstImpl(boolean z10, T t2);

        public abstract T get(int i10);

        public abstract T getFromResults(int i10, OsResults osResults);

        public abstract T lastImpl(boolean z10, T t2);
    }

    public static class IntegerValueOperator extends PrimitiveValueOperator<Integer> {
        public IntegerValueOperator(BaseRealm baseRealm, OsResults osResults, Class<Integer> cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public Integer get(int i10) {
            return Integer.valueOf(((Long) this.osResults.getValue(i10)).intValue());
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public Integer getFromResults(int i10, OsResults osResults) {
            Long l10 = (Long) osResults.getValue(i10);
            if (l10 == null) {
                return null;
            }
            return Integer.valueOf(l10.intValue());
        }
    }

    public static class ModelCollectionOperator<T> extends CollectionOperator<T> {
        public ModelCollectionOperator(BaseRealm baseRealm, OsResults osResults, Class<T> cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T convertRowToObject(UncheckedRow uncheckedRow) {
            return (T) this.baseRealm.get(this.classSpec, this.className, uncheckedRow);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T firstImpl(boolean z10, T t2) {
            return convertToObject(this.osResults.firstUncheckedRow(), z10, t2);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T get(int i10) {
            return (T) this.baseRealm.get(this.classSpec, this.className, this.osResults.getUncheckedRow(i10));
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T getFromResults(int i10, OsResults osResults) {
            return convertRowToObject(osResults.getUncheckedRow(i10));
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T lastImpl(boolean z10, T t2) {
            return convertToObject(this.osResults.lastUncheckedRow(), z10, t2);
        }
    }

    public static class PrimitiveValueOperator<T> extends CollectionOperator<T> {
        public PrimitiveValueOperator(BaseRealm baseRealm, OsResults osResults, Class<T> cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T convertRowToObject(UncheckedRow uncheckedRow) {
            throw new UnsupportedOperationException("Method 'convertRowToObject' cannot be used on primitive Realm collections.");
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T firstImpl(boolean z10, T t2) {
            return this.osResults.size() != 0 ? (T) this.osResults.getValue(0) : t2;
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T get(int i10) {
            return (T) this.osResults.getValue(i10);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T getFromResults(int i10, OsResults osResults) {
            return (T) osResults.getValue(i10);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public T lastImpl(boolean z10, T t2) {
            int size = (int) this.osResults.size();
            return size != 0 ? (T) this.osResults.getValue(size - 1) : t2;
        }
    }

    public static class RealmAnyValueOperator extends PrimitiveValueOperator<RealmAny> {
        public RealmAnyValueOperator(BaseRealm baseRealm, OsResults osResults, Class<RealmAny> cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public RealmAny get(int i10) {
            return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, (NativeRealmAny) this.osResults.getValue(i10)));
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public RealmAny getFromResults(int i10, OsResults osResults) {
            return new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, (NativeRealmAny) osResults.getValue(i10)));
        }
    }

    public class RealmCollectionIterator extends OsResults.Iterator<E> {
        public RealmCollectionIterator() {
            super(OrderedRealmCollectionImpl.this.osResults);
        }

        @Override // io.realm.internal.OsResults.Iterator
        public E convertRowToObject(UncheckedRow uncheckedRow) {
            return OrderedRealmCollectionImpl.this.operator.convertRowToObject(uncheckedRow);
        }

        @Override // io.realm.internal.OsResults.Iterator
        public E getInternal(int i10, OsResults osResults) {
            return OrderedRealmCollectionImpl.this.operator.getFromResults(i10, osResults);
        }
    }

    public class RealmCollectionListIterator extends OsResults.ListIterator<E> {
        public RealmCollectionListIterator(int i10) {
            super(OrderedRealmCollectionImpl.this.osResults, i10);
        }

        @Override // io.realm.internal.OsResults.Iterator
        public E convertRowToObject(UncheckedRow uncheckedRow) {
            return OrderedRealmCollectionImpl.this.operator.convertRowToObject(uncheckedRow);
        }

        @Override // io.realm.internal.OsResults.Iterator
        public E getInternal(int i10, OsResults osResults) {
            return OrderedRealmCollectionImpl.this.operator.getFromResults(i10, osResults);
        }
    }

    public static class ShortValueOperator extends PrimitiveValueOperator<Short> {
        public ShortValueOperator(BaseRealm baseRealm, OsResults osResults, Class<Short> cls, String str) {
            super(baseRealm, osResults, cls, str);
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public Short get(int i10) {
            return Short.valueOf(((Long) this.osResults.getValue(i10)).shortValue());
        }

        @Override // io.realm.OrderedRealmCollectionImpl.PrimitiveValueOperator, io.realm.OrderedRealmCollectionImpl.CollectionOperator
        public Short getFromResults(int i10, OsResults osResults) {
            Long l10 = (Long) osResults.getValue(i10);
            if (l10 == null) {
                return null;
            }
            return Short.valueOf(l10.shortValue());
        }
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, Class<E> cls) {
        this(baseRealm, osResults, cls, null, getCollectionOperator(false, baseRealm, osResults, cls, null));
    }

    private E firstImpl(boolean z10, E e10) {
        return this.operator.firstImpl(z10, e10);
    }

    public static <T> CollectionOperator<T> getCollectionOperator(boolean z10, BaseRealm baseRealm, OsResults osResults, Class<T> cls, String str) {
        if (!z10) {
            return new ModelCollectionOperator(baseRealm, osResults, cls, str);
        }
        if (cls == Integer.class) {
            return new IntegerValueOperator(baseRealm, osResults, Integer.class, str);
        }
        if (cls == Short.class) {
            return new ShortValueOperator(baseRealm, osResults, Short.class, str);
        }
        if (cls == Byte.class) {
            return new ByteValueOperator(baseRealm, osResults, Byte.class, str);
        }
        return cls == RealmAny.class ? new RealmAnyValueOperator(baseRealm, osResults, RealmAny.class, str) : new PrimitiveValueOperator(baseRealm, osResults, cls, str);
    }

    private long getColumnKeyForSort(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Non-empty field name required.");
        }
        if (str.contains(".")) {
            throw new IllegalArgumentException("Aggregates on child object fields are not supported: ".concat(str));
        }
        long columnKey = this.osResults.getTable().getColumnKey(str);
        if (columnKey >= 0) {
            return columnKey;
        }
        Locale locale = Locale.US;
        throw new IllegalArgumentException(a.D("Field '", str, "' does not exist."));
    }

    private E lastImpl(boolean z10, E e10) {
        return this.operator.lastImpl(z10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean add(E e10) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // io.realm.RealmCollection
    public double average(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.AVERAGE, getColumnKeyForSort(str)).doubleValue();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public boolean contains(Object obj) {
        if (!isLoaded() || ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm() == InvalidRow.INSTANCE)) {
            return false;
        }
        for (E e10 : this) {
            if ((e10 instanceof byte[]) && (obj instanceof byte[])) {
                if (Arrays.equals((byte[]) e10, (byte[]) obj)) {
                    return true;
                }
            } else {
                if (e10 != null && e10.equals(obj)) {
                    return true;
                }
                if (e10 == null && obj == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public RealmResults<E> createLoadedResults(OsResults osResults) {
        String str = this.className;
        RealmResults<E> realmResults = str != null ? new RealmResults<>(this.baseRealm, osResults, str) : new RealmResults<>(this.baseRealm, osResults, this.classSpec);
        realmResults.load();
        return realmResults;
    }

    @Override // io.realm.OrderedRealmCollection
    public OrderedRealmCollectionSnapshot<E> createSnapshot() {
        String str = this.className;
        return str != null ? new OrderedRealmCollectionSnapshot<>(this.baseRealm, this.osResults, str) : new OrderedRealmCollectionSnapshot<>(this.baseRealm, this.osResults, this.classSpec);
    }

    @Override // io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
        this.baseRealm.checkIfValid();
        if (size() <= 0) {
            return false;
        }
        this.osResults.clear();
        return true;
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteFirstFromRealm() {
        this.baseRealm.checkIfValidAndInTransaction();
        return this.osResults.deleteFirst();
    }

    @Override // io.realm.OrderedRealmCollection
    public void deleteFromRealm(int i10) {
        this.baseRealm.checkIfValidAndInTransaction();
        this.osResults.delete(i10);
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteLastFromRealm() {
        this.baseRealm.checkIfValidAndInTransaction();
        return this.osResults.deleteLast();
    }

    @Override // io.realm.OrderedRealmCollection
    public E first() {
        return firstImpl(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        this.baseRealm.checkIfValid();
        return this.operator.get(i10);
    }

    public OsResults getOsResults() {
        return this.osResults;
    }

    public Realm getRealm() {
        this.baseRealm.checkIfValid();
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return (Realm) baseRealm;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }

    public Table getTable() {
        return this.osResults.getTable();
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isManaged() {
        return true;
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isValid() {
        return this.osResults.isValid();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new RealmCollectionIterator();
    }

    @Override // io.realm.OrderedRealmCollection
    public E last() {
        return lastImpl(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new RealmCollectionListIterator(0);
    }

    @Override // io.realm.RealmCollection
    public Number max(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.MAXIMUM, getColumnKeyForSort(str));
    }

    @Override // io.realm.RealmCollection
    public Date maxDate(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateDate(OsResults.Aggregate.MAXIMUM, getColumnKeyForSort(str));
    }

    @Override // io.realm.RealmCollection
    public Number min(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.MINIMUM, getColumnKeyForSort(str));
    }

    @Override // io.realm.RealmCollection
    public Date minDate(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateDate(OsResults.Aggregate.MINIMUM, getColumnKeyForSort(str));
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E remove(int i10) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (!isLoaded()) {
            return 0;
        }
        long size = this.osResults.size();
        if (size > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) size;
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str) {
        return createLoadedResults(this.osResults.sort(this.baseRealm.getSchema().getKeyPathMapping(), str, Sort.ASCENDING));
    }

    @Override // io.realm.RealmCollection
    public Number sum(String str) {
        this.baseRealm.checkIfValid();
        return this.osResults.aggregateNumber(OsResults.Aggregate.SUM, getColumnKeyForSort(str));
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, Class<E> cls, CollectionOperator<E> collectionOperator) {
        this(baseRealm, osResults, cls, null, collectionOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    @Deprecated
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    @Override // io.realm.OrderedRealmCollection
    public E first(E e10) {
        return firstImpl(false, e10);
    }

    @Override // io.realm.OrderedRealmCollection
    public E last(E e10) {
        return lastImpl(false, e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new RealmCollectionListIterator(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException(NOT_SUPPORTED_MESSAGE);
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, String str) {
        this(baseRealm, osResults, null, str, getCollectionOperator(false, baseRealm, osResults, null, str));
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort) {
        return createLoadedResults(this.osResults.sort(this.baseRealm.getSchema().getKeyPathMapping(), str, sort));
    }

    public OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, String str, CollectionOperator<E> collectionOperator) {
        this(baseRealm, osResults, null, str, collectionOperator);
    }

    private OrderedRealmCollectionImpl(BaseRealm baseRealm, OsResults osResults, Class<E> cls, String str, CollectionOperator<E> collectionOperator) {
        this.baseRealm = baseRealm;
        this.osResults = osResults;
        this.classSpec = cls;
        this.className = str;
        this.operator = collectionOperator;
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String[] strArr, Sort[] sortArr) {
        return createLoadedResults(this.osResults.sort(this.baseRealm.getSchema().getKeyPathMapping(), strArr, sortArr));
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }
}
