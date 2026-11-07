package io.realm;

import io.realm.internal.RealmAnyNativeFunctions;
import io.realm.internal.TableQuery;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RealmAnyNativeFunctionsImpl implements RealmAnyNativeFunctions {
    @Override // io.realm.internal.RealmAnyNativeFunctions
    public void callRawPredicate(TableQuery tableQuery, OsKeyPathMapping osKeyPathMapping, String str, RealmAny... realmAnyArr) {
        long[] jArr = new long[realmAnyArr.length];
        for (int i10 = 0; i10 < realmAnyArr.length; i10++) {
            try {
                jArr[i10] = realmAnyArr[i10].getNativePtr();
            } catch (IllegalStateException e10) {
                throw new IllegalArgumentException("Unmanaged Realm objects are not valid query arguments", e10);
            }
        }
        tableQuery.rawPredicateWithPointers(osKeyPathMapping, str, jArr);
    }

    @Override // io.realm.internal.RealmAnyNativeFunctions
    public void handleItem(long j, RealmAny realmAny) {
        OsObjectBuilder.nativeAddRealmAnyListItem(j, realmAny.getNativePtr());
    }

    @Override // io.realm.internal.RealmAnyNativeFunctions
    public void handleItem(long j, Map.Entry<String, RealmAny> entry) {
        OsObjectBuilder.nativeAddRealmAnyDictionaryEntry(j, entry.getKey(), entry.getValue().getNativePtr());
    }
}
