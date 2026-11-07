package io.realm;

import io.realm.internal.ManageableObject;
import io.realm.internal.Row;
import io.realm.internal.Table;

/* JADX INFO: loaded from: classes.dex */
public abstract class MutableRealmInteger implements Comparable<MutableRealmInteger>, ManageableObject {

    public static abstract class Managed<T extends RealmModel> extends MutableRealmInteger {
        private BaseRealm getRealm() {
            return getProxyState().getRealm$realm();
        }

        private Row getRow() {
            return getProxyState().getRow$realm();
        }

        private void setValue(Long l10, boolean z10) {
            Row row = getRow();
            Table table = row.getTable();
            long objectKey = row.getObjectKey();
            long columnIndex = getColumnIndex();
            if (l10 == null) {
                table.setNull(columnIndex, objectKey, z10);
            } else {
                table.setLong(columnIndex, objectKey, l10.longValue(), z10);
            }
        }

        @Override // io.realm.MutableRealmInteger, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(MutableRealmInteger mutableRealmInteger) {
            return compareTo(mutableRealmInteger);
        }

        @Override // io.realm.MutableRealmInteger
        public final void decrement(long j) {
            increment(-j);
        }

        @Override // io.realm.MutableRealmInteger
        public final Long get() {
            Row row = getRow();
            row.checkIfAttached();
            long columnIndex = getColumnIndex();
            if (row.isNull(columnIndex)) {
                return null;
            }
            return Long.valueOf(row.getLong(columnIndex));
        }

        public abstract long getColumnIndex();

        public abstract ProxyState<T> getProxyState();

        @Override // io.realm.MutableRealmInteger
        public final void increment(long j) {
            getRealm().checkIfValidAndInTransaction();
            Row row = getRow();
            row.getTable().incrementLong(getColumnIndex(), row.getObjectKey(), j);
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
            return getRealm().isFrozen();
        }

        @Override // io.realm.internal.ManageableObject
        public final boolean isManaged() {
            return true;
        }

        @Override // io.realm.internal.ManageableObject
        public final boolean isValid() {
            return !getRealm().isClosed() && getRow().isValid();
        }

        @Override // io.realm.MutableRealmInteger
        public final void set(Long l10) {
            ProxyState<T> proxyState = getProxyState();
            proxyState.getRealm$realm().checkIfValidAndInTransaction();
            if (!proxyState.isUnderConstruction()) {
                setValue(l10, false);
            } else if (proxyState.getAcceptDefaultValue$realm()) {
                setValue(l10, true);
            }
        }
    }

    public static final class Unmanaged extends MutableRealmInteger {
        private Long value;

        public Unmanaged(Long l10) {
            this.value = l10;
        }

        @Override // io.realm.MutableRealmInteger, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(MutableRealmInteger mutableRealmInteger) {
            return compareTo(mutableRealmInteger);
        }

        @Override // io.realm.MutableRealmInteger
        public void decrement(long j) {
            increment(-j);
        }

        @Override // io.realm.MutableRealmInteger
        public Long get() {
            return this.value;
        }

        @Override // io.realm.MutableRealmInteger
        public void increment(long j) {
            Long l10 = this.value;
            if (l10 == null) {
                throw new IllegalStateException("Cannot increment a MutableRealmInteger whose value is null. Set its value first.");
            }
            this.value = Long.valueOf(l10.longValue() + j);
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isFrozen() {
            return false;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isManaged() {
            return false;
        }

        @Override // io.realm.internal.ManageableObject
        public boolean isValid() {
            return true;
        }

        @Override // io.realm.MutableRealmInteger
        public void set(Long l10) {
            this.value = l10;
        }
    }

    public static MutableRealmInteger ofNull() {
        return new Unmanaged(null);
    }

    public static MutableRealmInteger valueOf(Long l10) {
        return new Unmanaged(l10);
    }

    public abstract void decrement(long j);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MutableRealmInteger)) {
            return false;
        }
        Long l10 = get();
        Long l11 = ((MutableRealmInteger) obj).get();
        if (l10 == null) {
            return l11 == null;
        }
        return l10.equals(l11);
    }

    public abstract Long get();

    public final int hashCode() {
        Long l10 = get();
        if (l10 == null) {
            return 0;
        }
        return l10.hashCode();
    }

    public abstract void increment(long j);

    public final boolean isNull() {
        return get() == null;
    }

    public final void set(long j) {
        set(Long.valueOf(j));
    }

    public abstract void set(Long l10);

    public static MutableRealmInteger valueOf(long j) {
        return valueOf(Long.valueOf(j));
    }

    @Override // java.lang.Comparable
    public final int compareTo(MutableRealmInteger mutableRealmInteger) {
        Long l10 = get();
        Long l11 = mutableRealmInteger.get();
        if (l10 == null) {
            return l11 == null ? 0 : -1;
        }
        if (l11 == null) {
            return 1;
        }
        return l10.compareTo(l11);
    }

    public static MutableRealmInteger valueOf(String str) {
        return valueOf(Long.parseLong(str));
    }
}
