package io.realm;

import io.realm.internal.OsMap;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.util.Pair;
import java.lang.reflect.Array;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes.dex */
class RealmMapEntrySet<K, V> implements Set<Map.Entry<K, V>> {
    private final BaseRealm baseRealm;
    private final EqualsHelper<K, V> equalsHelper;
    private final IteratorType iteratorType;
    private final OsMap osMap;
    private final TypeSelectorForMap<K, V> typeSelectorForMap;

    /* JADX INFO: renamed from: io.realm.RealmMapEntrySet$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$realm$RealmMapEntrySet$IteratorType;

        static {
            int[] iArr = new int[IteratorType.values().length];
            $SwitchMap$io$realm$RealmMapEntrySet$IteratorType = iArr;
            try {
                iArr[IteratorType.LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.FLOAT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.DOUBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.DATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.BINARY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.OBJECT_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.UUID.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.MIXED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$realm$RealmMapEntrySet$IteratorType[IteratorType.OBJECT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static class BinaryValueIterator<K> extends EntrySetIterator<K, byte[]> {
        public BinaryValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, byte[]> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (byte[]) entryForPrimitive.second);
        }
    }

    public static class BooleanValueIterator<K> extends EntrySetIterator<K, Boolean> {
        public BooleanValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Boolean> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Boolean) entryForPrimitive.second);
        }
    }

    public static class ByteValueIterator<K> extends EntrySetIterator<K, Byte> {
        public ByteValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Byte> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            Object obj = entryForPrimitive.second;
            return obj == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Byte.valueOf(((Long) obj).byteValue()));
        }
    }

    public static class DateValueIterator<K> extends EntrySetIterator<K, Date> {
        public DateValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Date> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Date) entryForPrimitive.second);
        }
    }

    public static class Decimal128ValueIterator<K> extends EntrySetIterator<K, Decimal128> {
        public Decimal128ValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Decimal128> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Decimal128) entryForPrimitive.second);
        }
    }

    public static class DoubleValueIterator<K> extends EntrySetIterator<K, Double> {
        public DoubleValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Double> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Double) entryForPrimitive.second);
        }
    }

    public static abstract class EntrySetIterator<K, V> implements Iterator<Map.Entry<K, V>> {
        protected final BaseRealm baseRealm;
        protected final OsMap osMap;
        private int pos = -1;

        public EntrySetIterator(OsMap osMap, BaseRealm baseRealm) {
            this.osMap = osMap;
            this.baseRealm = baseRealm;
        }

        public abstract Map.Entry<K, V> getEntryInternal(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return ((long) (this.pos + 1)) < this.osMap.size();
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            this.pos++;
            long size = this.osMap.size();
            int i10 = this.pos;
            if (i10 < size) {
                return getEntryInternal(i10);
            }
            throw new NoSuchElementException("Cannot access index " + this.pos + " when size is " + size + ". Remember to check hasNext() before using next().");
        }
    }

    public static class FloatValueIterator<K> extends EntrySetIterator<K, Float> {
        public FloatValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Float> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Float) entryForPrimitive.second);
        }
    }

    public static class IntegerValueIterator<K> extends EntrySetIterator<K, Integer> {
        public IntegerValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Integer> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            Object obj = entryForPrimitive.second;
            return obj == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Integer.valueOf(((Long) obj).intValue()));
        }
    }

    public enum IteratorType {
        LONG,
        BYTE,
        SHORT,
        INTEGER,
        FLOAT,
        DOUBLE,
        STRING,
        BOOLEAN,
        DATE,
        DECIMAL128,
        BINARY,
        OBJECT_ID,
        UUID,
        MIXED,
        OBJECT
    }

    public static class LongValueIterator<K> extends EntrySetIterator<K, Long> {
        public LongValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Long> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            Object obj = entryForPrimitive.second;
            if (obj == null) {
                return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null);
            }
            return new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (Long) obj);
        }
    }

    public static class ObjectIdValueIterator<K> extends EntrySetIterator<K, ObjectId> {
        public ObjectIdValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, ObjectId> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (ObjectId) entryForPrimitive.second);
        }
    }

    public static class RealmAnyValueIterator<K> extends EntrySetIterator<K, RealmAny> {
        public RealmAnyValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, RealmAny> getEntryInternal(int i10) {
            Pair<K, NativeRealmAny> keyRealmAnyPair = this.osMap.getKeyRealmAnyPair(i10);
            return new AbstractMap.SimpleImmutableEntry(keyRealmAnyPair.first, new RealmAny(RealmAnyOperator.fromNativeRealmAny(this.baseRealm, keyRealmAnyPair.second)));
        }
    }

    public static class RealmModelValueIterator<K, V> extends EntrySetIterator<K, V> {
        private final TypeSelectorForMap<K, V> typeSelectorForMap;

        public RealmModelValueIterator(OsMap osMap, BaseRealm baseRealm, TypeSelectorForMap<K, V> typeSelectorForMap) {
            super(osMap, baseRealm);
            this.typeSelectorForMap = typeSelectorForMap;
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, V> getEntryInternal(int i10) {
            Pair<K, Long> keyObjRowPair = this.osMap.getKeyObjRowPair(i10);
            K k7 = keyObjRowPair.first;
            long jLongValue = keyObjRowPair.second.longValue();
            return jLongValue == -1 ? new AbstractMap.SimpleImmutableEntry(k7, null) : this.typeSelectorForMap.getModelEntry(this.baseRealm, jLongValue, k7);
        }
    }

    public static class ShortValueIterator<K> extends EntrySetIterator<K, Short> {
        public ShortValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, Short> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            Object obj = entryForPrimitive.second;
            return obj == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, Short.valueOf(((Long) obj).shortValue()));
        }
    }

    public static class StringValueIterator<K> extends EntrySetIterator<K, String> {
        public StringValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, String> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (String) entryForPrimitive.second);
        }
    }

    public static class UUIDValueIterator<K> extends EntrySetIterator<K, UUID> {
        public UUIDValueIterator(OsMap osMap, BaseRealm baseRealm) {
            super(osMap, baseRealm);
        }

        @Override // io.realm.RealmMapEntrySet.EntrySetIterator
        public Map.Entry<K, UUID> getEntryInternal(int i10) {
            Pair<K, Object> entryForPrimitive = this.osMap.getEntryForPrimitive(i10);
            return entryForPrimitive.second == null ? new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, null) : new AbstractMap.SimpleImmutableEntry(entryForPrimitive.first, (UUID) entryForPrimitive.second);
        }
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, TypeSelectorForMap<K, V> typeSelectorForMap) {
        this.baseRealm = baseRealm;
        this.osMap = osMap;
        this.iteratorType = iteratorType;
        this.equalsHelper = new GenericEquals();
        this.typeSelectorForMap = typeSelectorForMap;
    }

    private static <K, V> EntrySetIterator<K, V> iteratorFactory(IteratorType iteratorType, OsMap osMap, BaseRealm baseRealm, TypeSelectorForMap typeSelectorForMap) {
        switch (AnonymousClass1.$SwitchMap$io$realm$RealmMapEntrySet$IteratorType[iteratorType.ordinal()]) {
            case 1:
                return new LongValueIterator(osMap, baseRealm);
            case 2:
                return new ByteValueIterator(osMap, baseRealm);
            case 3:
                return new ShortValueIterator(osMap, baseRealm);
            case 4:
                return new IntegerValueIterator(osMap, baseRealm);
            case 5:
                return new FloatValueIterator(osMap, baseRealm);
            case 6:
                return new DoubleValueIterator(osMap, baseRealm);
            case 7:
                return new StringValueIterator(osMap, baseRealm);
            case 8:
                return new BooleanValueIterator(osMap, baseRealm);
            case 9:
                return new DateValueIterator(osMap, baseRealm);
            case 10:
                return new Decimal128ValueIterator(osMap, baseRealm);
            case 11:
                return new BinaryValueIterator(osMap, baseRealm);
            case 12:
                return new ObjectIdValueIterator(osMap, baseRealm);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                return new UUIDValueIterator(osMap, baseRealm);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                return new RealmAnyValueIterator(osMap, baseRealm);
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                if (typeSelectorForMap != null) {
                    return new RealmModelValueIterator(osMap, baseRealm, typeSelectorForMap);
                }
                throw new IllegalArgumentException("Missing class container when creating RealmModelValueIterator.");
            default:
                throw new IllegalArgumentException("Invalid iterator type.");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        for (Map.Entry<K, V> entry : this) {
            if (entry == null && obj == null) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                break;
            }
            if (entry != null && this.equalsHelper.equalsHelper(entry, (Map.Entry) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return isEmpty();
        }
        for (Object obj : collection) {
            if (!(obj instanceof Map.Entry) || !contains((Map.Entry) obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.osMap.size() == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return iteratorFactory(this.iteratorType, this.osMap, this.baseRealm, this.typeSelectorForMap);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        long size = this.osMap.size();
        if (size < 2147483647L) {
            return (int) size;
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[(int) this.osMap.size()];
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException("This set is immutable and cannot be modified.");
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        long size = this.osMap.size();
        Object[] objArr = (((long) tArr.length) == size || ((long) tArr.length) > size) ? tArr : (T[]) ((Object[]) Array.newInstance((Class<?>) Map.Entry.class, (int) size));
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        if (tArr.length > size) {
            objArr[i10] = null;
        }
        return (T[]) objArr;
    }

    public RealmMapEntrySet(BaseRealm baseRealm, OsMap osMap, IteratorType iteratorType, EqualsHelper<K, V> equalsHelper, TypeSelectorForMap<K, V> typeSelectorForMap) {
        this.baseRealm = baseRealm;
        this.osMap = osMap;
        this.iteratorType = iteratorType;
        this.equalsHelper = equalsHelper;
        this.typeSelectorForMap = typeSelectorForMap;
    }
}
