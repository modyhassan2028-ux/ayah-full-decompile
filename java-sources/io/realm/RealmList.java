package io.realm;

import android.support.v4.media.session.p;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.realm.internal.InvalidRow;
import io.realm.internal.OsList;
import io.realm.internal.OsResults;
import io.realm.internal.RealmObjectProxy;
import io.realm.rx.CollectionChange;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import p123m2.c;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class RealmList<E> extends AbstractList<E> implements OrderedRealmCollection<E> {
    static final String ALLOWED_ONLY_FOR_REALM_MODEL_ELEMENT_MESSAGE = "This feature is available only when the element type is implementing RealmModel.";
    private static final String ONLY_IN_MANAGED_MODE_MESSAGE = "This method is only available in managed mode.";
    private static final String REMOVE_OUTSIDE_TRANSACTION_ERROR = "Objects can only be removed from inside a write transaction.";
    public final BaseRealm baseRealm;
    protected String className;
    protected Class<E> clazz;
    private final ManagedListOperator<E> osListOperator;
    private List<E> unmanagedList;

    public class RealmItr implements Iterator<E> {
        int cursor;
        int expectedModCount;
        int lastRet;

        private RealmItr() {
            this.cursor = 0;
            this.lastRet = -1;
            this.expectedModCount = ((AbstractList) RealmList.this).modCount;
        }

        public final void checkConcurrentModification() {
            if (((AbstractList) RealmList.this).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            RealmList.this.checkValidRealm();
            checkConcurrentModification();
            return this.cursor != RealmList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            RealmList.this.checkValidRealm();
            checkConcurrentModification();
            int i10 = this.cursor;
            try {
                E e10 = (E) RealmList.this.get(i10);
                this.lastRet = i10;
                this.cursor = i10 + 1;
                return e10;
            } catch (IndexOutOfBoundsException unused) {
                checkConcurrentModification();
                StringBuilder sbW = c.w(i10, "Cannot access index ", " when size is ");
                sbW.append(RealmList.this.size());
                sbW.append(". Remember to check hasNext() before using next().");
                throw new NoSuchElementException(sbW.toString());
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            RealmList.this.checkValidRealm();
            if (this.lastRet < 0) {
                throw new IllegalStateException("Cannot call remove() twice. Must call next() in between.");
            }
            checkConcurrentModification();
            try {
                RealmList.this.remove(this.lastRet);
                int i10 = this.lastRet;
                int i11 = this.cursor;
                if (i10 < i11) {
                    this.cursor = i11 - 1;
                }
                this.lastRet = -1;
                this.expectedModCount = ((AbstractList) RealmList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public class RealmListItr extends RealmList<E>.RealmItr implements ListIterator<E> {
        public RealmListItr(int i10) {
            super();
            if (i10 >= 0 && i10 <= RealmList.this.size()) {
                this.cursor = i10;
                return;
            }
            StringBuilder sb = new StringBuilder("Starting location must be a valid index: [0, ");
            sb.append(RealmList.this.size() - 1);
            sb.append("]. Index was ");
            sb.append(i10);
            throw new IndexOutOfBoundsException(sb.toString());
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            RealmList.this.baseRealm.checkIfValid();
            checkConcurrentModification();
            try {
                int i10 = this.cursor;
                RealmList.this.add(i10, e10);
                this.lastRet = -1;
                this.cursor = i10 + 1;
                this.expectedModCount = ((AbstractList) RealmList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.cursor != 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.cursor;
        }

        @Override // java.util.ListIterator
        public E previous() {
            checkConcurrentModification();
            int i10 = this.cursor - 1;
            try {
                E e10 = (E) RealmList.this.get(i10);
                this.cursor = i10;
                this.lastRet = i10;
                return e10;
            } catch (IndexOutOfBoundsException unused) {
                checkConcurrentModification();
                throw new NoSuchElementException(a.B(i10, "Cannot access index less than zero. This was ", ". Remember to check hasPrevious() before using previous()."));
            }
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.cursor - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            RealmList.this.baseRealm.checkIfValid();
            if (this.lastRet < 0) {
                throw new IllegalStateException();
            }
            checkConcurrentModification();
            try {
                RealmList.this.set(this.lastRet, e10);
                this.expectedModCount = ((AbstractList) RealmList.this).modCount;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    public RealmList() {
        this.baseRealm = null;
        this.osListOperator = null;
        this.unmanagedList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkValidRealm() {
        this.baseRealm.checkIfValid();
    }

    private E firstImpl(boolean z10, E e10) {
        if (isManaged()) {
            checkValidRealm();
            if (!this.osListOperator.isEmpty()) {
                return get(0);
            }
        } else {
            List<E> list = this.unmanagedList;
            if (list != null && !list.isEmpty()) {
                return this.unmanagedList.get(0);
            }
        }
        if (z10) {
            throw new IndexOutOfBoundsException("The list is empty.");
        }
        return e10;
    }

    private ManagedListOperator<E> getOperator(BaseRealm baseRealm, OsList osList, Class<E> cls, String str) {
        if (cls == null || isClassForRealmModel(cls)) {
            return new RealmModelListOperator(baseRealm, osList, cls, str);
        }
        if (cls == String.class) {
            return new StringListOperator(baseRealm, osList, cls);
        }
        if (cls == Long.class || cls == Integer.class || cls == Short.class || cls == Byte.class) {
            return new LongListOperator(baseRealm, osList, cls);
        }
        if (cls == Boolean.class) {
            return new BooleanListOperator(baseRealm, osList, cls);
        }
        if (cls == byte[].class) {
            return new BinaryListOperator(baseRealm, osList, cls);
        }
        if (cls == Double.class) {
            return new DoubleListOperator(baseRealm, osList, cls);
        }
        if (cls == Float.class) {
            return new FloatListOperator(baseRealm, osList, cls);
        }
        if (cls == Date.class) {
            return new DateListOperator(baseRealm, osList, cls);
        }
        if (cls == Decimal128.class) {
            return new Decimal128ListOperator(baseRealm, osList, cls);
        }
        if (cls == ObjectId.class) {
            return new ObjectIdListOperator(baseRealm, osList, cls);
        }
        if (cls == UUID.class) {
            return new UUIDListOperator(baseRealm, osList, cls);
        }
        if (cls == RealmAny.class) {
            return new RealmAnyListOperator(baseRealm, osList, cls);
        }
        throw new IllegalArgumentException("Unexpected value class: ".concat(cls.getName()));
    }

    private boolean isAttached() {
        ManagedListOperator<E> managedListOperator = this.osListOperator;
        return managedListOperator != null && managedListOperator.isValid();
    }

    private static boolean isClassForRealmModel(Class<?> cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    private E lastImpl(boolean z10, E e10) {
        if (isManaged()) {
            checkValidRealm();
            if (!this.osListOperator.isEmpty()) {
                return get(this.osListOperator.size() - 1);
            }
        } else {
            List<E> list = this.unmanagedList;
            if (list != null && !list.isEmpty()) {
                List<E> list2 = this.unmanagedList;
                return list2.get(list2.size() - 1);
            }
        }
        if (z10) {
            throw new IndexOutOfBoundsException("The list is empty.");
        }
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        if (isManaged()) {
            checkValidRealm();
            this.osListOperator.insert(i10, e10);
        } else {
            this.unmanagedList.add(i10, e10);
        }
        ((AbstractList) this).modCount++;
    }

    public void addChangeListener(OrderedRealmCollectionChangeListener<RealmList<E>> orderedRealmCollectionChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, orderedRealmCollectionChangeListener, true);
        this.osListOperator.getOsList().addListener(this, orderedRealmCollectionChangeListener);
    }

    public Observable<CollectionChange<RealmList<E>>> asChangesetObservable() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return baseRealm.configuration.getRxFactory().changesetsFrom((Realm) this.baseRealm, this);
        }
        if (baseRealm instanceof DynamicRealm) {
            return baseRealm.configuration.getRxFactory().changesetsFrom((DynamicRealm) baseRealm, this);
        }
        throw new UnsupportedOperationException(this.baseRealm.getClass() + " does not support RxJava2.");
    }

    public Flowable<RealmList<E>> asFlowable() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm instanceof Realm) {
            return baseRealm.configuration.getRxFactory().from((Realm) this.baseRealm, this);
        }
        if (baseRealm instanceof DynamicRealm) {
            return baseRealm.configuration.getRxFactory().from((DynamicRealm) this.baseRealm, this);
        }
        throw new UnsupportedOperationException(this.baseRealm.getClass() + " does not support RxJava2.");
    }

    @Override // io.realm.RealmCollection
    public double average(String str) {
        return where().average(str);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (isManaged()) {
            checkValidRealm();
            this.osListOperator.removeAll();
        } else {
            this.unmanagedList.clear();
        }
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, io.realm.RealmCollection
    public boolean contains(Object obj) {
        if (!isManaged()) {
            return this.unmanagedList.contains(obj);
        }
        this.baseRealm.checkIfValid();
        if ((obj instanceof RealmObjectProxy) && ((RealmObjectProxy) obj).realmGet$proxyState().getRow$realm() == InvalidRow.INSTANCE) {
            return false;
        }
        return super.contains(obj);
    }

    public long createAndAddEmbeddedObject() {
        return this.osListOperator.getOsList().createAndAddEmbeddedObject();
    }

    @Override // io.realm.OrderedRealmCollection
    public OrderedRealmCollectionSnapshot<E> createSnapshot() {
        if (!isManaged()) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }
        checkValidRealm();
        if (!this.osListOperator.forRealmModel()) {
            throw new UnsupportedOperationException(ALLOWED_ONLY_FOR_REALM_MODEL_ELEMENT_MESSAGE);
        }
        if (this.className != null) {
            BaseRealm baseRealm = this.baseRealm;
            return new OrderedRealmCollectionSnapshot<>(baseRealm, OsResults.createFromQuery(baseRealm.sharedRealm, this.osListOperator.getOsList().getQuery()), this.className);
        }
        BaseRealm baseRealm2 = this.baseRealm;
        return new OrderedRealmCollectionSnapshot<>(baseRealm2, OsResults.createFromQuery(baseRealm2.sharedRealm, this.osListOperator.getOsList().getQuery()), this.clazz);
    }

    @Override // io.realm.RealmCollection
    public boolean deleteAllFromRealm() {
        if (!isManaged()) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }
        checkValidRealm();
        if (this.osListOperator.isEmpty()) {
            return false;
        }
        this.osListOperator.deleteAll();
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteFirstFromRealm() {
        if (!isManaged()) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }
        if (this.osListOperator.isEmpty()) {
            return false;
        }
        deleteFromRealm(0);
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // io.realm.OrderedRealmCollection
    public void deleteFromRealm(int i10) {
        if (!isManaged()) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }
        checkValidRealm();
        this.osListOperator.delete(i10);
        ((AbstractList) this).modCount++;
    }

    @Override // io.realm.OrderedRealmCollection
    public boolean deleteLastFromRealm() {
        if (!isManaged()) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }
        if (this.osListOperator.isEmpty()) {
            return false;
        }
        this.osListOperator.deleteLast();
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // io.realm.OrderedRealmCollection
    public E first() {
        return firstImpl(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        if (!isManaged()) {
            return this.unmanagedList.get(i10);
        }
        checkValidRealm();
        return this.osListOperator.get(i10);
    }

    public OsList getOsList() {
        return this.osListOperator.getOsList();
    }

    public Realm getRealm() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm == null) {
            return null;
        }
        baseRealm.checkIfValid();
        BaseRealm baseRealm2 = this.baseRealm;
        if (baseRealm2 instanceof Realm) {
            return (Realm) baseRealm2;
        }
        throw new IllegalStateException("This method is only available for typed Realms");
    }

    @Override // io.realm.internal.ManageableObject
    public boolean isFrozen() {
        BaseRealm baseRealm = this.baseRealm;
        return baseRealm != null && baseRealm.isFrozen();
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        return true;
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isManaged() {
        return this.baseRealm != null;
    }

    @Override // io.realm.RealmCollection, io.realm.internal.ManageableObject
    public boolean isValid() {
        BaseRealm baseRealm = this.baseRealm;
        if (baseRealm == null) {
            return true;
        }
        if (baseRealm.isClosed()) {
            return false;
        }
        return isAttached();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return isManaged() ? new RealmItr() : super.iterator();
    }

    @Override // io.realm.OrderedRealmCollection
    public E last() {
        return lastImpl(true, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // io.realm.RealmCollection
    public boolean load() {
        return true;
    }

    @Override // io.realm.RealmCollection
    public Number max(String str) {
        return where().max(str);
    }

    @Override // io.realm.RealmCollection
    public Date maxDate(String str) {
        return where().maximumDate(str);
    }

    @Override // io.realm.RealmCollection
    public Number min(String str) {
        return where().min(str);
    }

    @Override // io.realm.RealmCollection
    public Date minDate(String str) {
        return where().minimumDate(str);
    }

    public void move(int i10, int i11) {
        if (isManaged()) {
            checkValidRealm();
            this.osListOperator.move(i10, i11);
            return;
        }
        int size = this.unmanagedList.size();
        if (i10 < 0 || size <= i10) {
            throw new IndexOutOfBoundsException(p.w(i10, size, "Invalid index ", ", size is "));
        }
        if (i11 < 0 || size <= i11) {
            throw new IndexOutOfBoundsException(p.w(i11, size, "Invalid index ", ", size is "));
        }
        this.unmanagedList.add(i11, this.unmanagedList.remove(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        E eRemove;
        if (isManaged()) {
            checkValidRealm();
            eRemove = get(i10);
            this.osListOperator.remove(i10);
        } else {
            eRemove = this.unmanagedList.remove(i10);
        }
        ((AbstractList) this).modCount++;
        return eRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        if (!isManaged() || this.baseRealm.isInTransaction()) {
            return super.removeAll(collection);
        }
        throw new IllegalStateException(REMOVE_OUTSIDE_TRANSACTION_ERROR);
    }

    public void removeAllChangeListeners() {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, null, false);
        this.osListOperator.getOsList().removeAllListeners();
    }

    public void removeChangeListener(OrderedRealmCollectionChangeListener<RealmList<E>> orderedRealmCollectionChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, orderedRealmCollectionChangeListener, true);
        this.osListOperator.getOsList().removeListener(this, orderedRealmCollectionChangeListener);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        if (!isManaged()) {
            return this.unmanagedList.set(i10, e10);
        }
        checkValidRealm();
        return this.osListOperator.set(i10, e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        if (!isManaged()) {
            return this.unmanagedList.size();
        }
        checkValidRealm();
        return this.osListOperator.size();
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str) {
        return sort(str, Sort.ASCENDING);
    }

    @Override // io.realm.RealmCollection
    public Number sum(String str) {
        return where().sum(str);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        if (isManaged()) {
            sb.append("RealmList<");
            String str = this.className;
            if (str != null) {
                sb.append(str);
            } else if (isClassForRealmModel(this.clazz)) {
                sb.append(this.baseRealm.getSchema().getSchemaForClass((Class<? extends RealmModel>) this.clazz).getClassName());
            } else {
                Class<E> cls = this.clazz;
                if (cls == byte[].class) {
                    sb.append(cls.getSimpleName());
                } else {
                    sb.append(cls.getName());
                }
            }
            sb.append(">@[");
            if (!isAttached()) {
                sb.append("invalid");
            } else if (isClassForRealmModel(this.clazz)) {
                while (i10 < size()) {
                    sb.append(((RealmObjectProxy) get(i10)).realmGet$proxyState().getRow$realm().getObjectKey());
                    sb.append(",");
                    i10++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            } else {
                while (i10 < size()) {
                    Object obj = get(i10);
                    if (obj instanceof byte[]) {
                        sb.append("byte[");
                        sb.append(((byte[]) obj).length);
                        sb.append("]");
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                    i10++;
                }
                if (size() > 0) {
                    sb.setLength(sb.length() - 1);
                }
            }
            sb.append("]");
        } else {
            sb.append("RealmList<?>@[");
            int size = size();
            while (i10 < size) {
                Object obj2 = get(i10);
                if (obj2 instanceof RealmModel) {
                    sb.append(System.identityHashCode(obj2));
                } else if (obj2 instanceof byte[]) {
                    sb.append("byte[");
                    sb.append(((byte[]) obj2).length);
                    sb.append("]");
                } else {
                    sb.append(obj2);
                }
                sb.append(",");
                i10++;
            }
            if (size() > 0) {
                sb.setLength(sb.length() - 1);
            }
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // io.realm.RealmCollection
    public RealmQuery<E> where() {
        if (!isManaged()) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }
        checkValidRealm();
        if (this.osListOperator.forRealmModel()) {
            return RealmQuery.createQueryFromList(this);
        }
        throw new UnsupportedOperationException(ALLOWED_ONLY_FOR_REALM_MODEL_ELEMENT_MESSAGE);
    }

    @Override // io.realm.OrderedRealmCollection
    public E first(E e10) {
        return firstImpl(false, e10);
    }

    @Override // io.realm.internal.Freezable
    public RealmList<E> freeze() {
        if (!isManaged()) {
            throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
        }
        if (!isValid()) {
            throw new IllegalStateException("Only valid, managed RealmLists can be frozen.");
        }
        BaseRealm baseRealmFreeze = this.baseRealm.freeze();
        OsList osListFreeze = getOsList().freeze(baseRealmFreeze.sharedRealm);
        String str = this.className;
        return str != null ? new RealmList<>(str, osListFreeze, baseRealmFreeze) : new RealmList<>(this.clazz, osListFreeze, baseRealmFreeze);
    }

    @Override // io.realm.OrderedRealmCollection
    public E last(E e10) {
        return lastImpl(false, e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return isManaged() ? new RealmListItr(i10) : super.listIterator(i10);
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort) {
        if (isManaged()) {
            return where().sort(str, sort).findAll();
        }
        throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
    }

    public void addChangeListener(RealmChangeListener<RealmList<E>> realmChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, realmChangeListener, true);
        this.osListOperator.getOsList().addListener(this, realmChangeListener);
    }

    public void removeChangeListener(RealmChangeListener<RealmList<E>> realmChangeListener) {
        CollectionUtils.checkForAddRemoveListener(this.baseRealm, realmChangeListener, true);
        this.osListOperator.getOsList().removeListener(this, realmChangeListener);
    }

    public RealmList(E... eArr) {
        if (eArr != null) {
            this.baseRealm = null;
            this.osListOperator = null;
            ArrayList arrayList = new ArrayList(eArr.length);
            this.unmanagedList = arrayList;
            Collections.addAll(arrayList, eArr);
            return;
        }
        throw new IllegalArgumentException("The objects argument cannot be null");
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String str, Sort sort, String str2, Sort sort2) {
        return sort(new String[]{str, str2}, new Sort[]{sort, sort2});
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        if (isManaged()) {
            checkValidRealm();
            this.osListOperator.append(e10);
        } else {
            this.unmanagedList.add(e10);
        }
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // io.realm.OrderedRealmCollection
    public RealmResults<E> sort(String[] strArr, Sort[] sortArr) {
        if (isManaged()) {
            return where().sort(strArr, sortArr).findAll();
        }
        throw new UnsupportedOperationException(ONLY_IN_MANAGED_MODE_MESSAGE);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (isManaged() && !this.baseRealm.isInTransaction()) {
            throw new IllegalStateException(REMOVE_OUTSIDE_TRANSACTION_ERROR);
        }
        return super.remove(obj);
    }

    public RealmList(Class<E> cls, OsList osList, BaseRealm baseRealm) {
        this.clazz = cls;
        this.osListOperator = getOperator(baseRealm, osList, cls, null);
        this.baseRealm = baseRealm;
    }

    public RealmList(String str, OsList osList, BaseRealm baseRealm) {
        this.baseRealm = baseRealm;
        this.className = str;
        this.osListOperator = getOperator(baseRealm, osList, null, str);
    }
}
