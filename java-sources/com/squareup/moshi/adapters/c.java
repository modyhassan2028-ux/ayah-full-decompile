package com.squareup.moshi.adapters;

import V8.d;
import android.support.v4.media.session.p;
import androidx.datastore.preferences.protobuf.C0736j;
import com.ayah.common.data.dao.notification.ReminderDestination;
import com.google.android.gms.internal.measurement.B1;
import com.squareup.moshi.C;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.j;
import com.squareup.moshi.m;
import com.squareup.moshi.n;
import com.squareup.moshi.o;
import com.squareup.moshi.s;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonAdapter f15433c;

    public c(List list, List list2, JsonAdapter jsonAdapter) {
        this.f15431a = list;
        this.f15432b = list2;
        this.f15433c = jsonAdapter;
    }

    @Override // com.squareup.moshi.j
    public final JsonAdapter a(Type type, Set set, C c10) {
        if (B1.F(type) != ReminderDestination.class || !set.isEmpty()) {
            return null;
        }
        List list = this.f15432b;
        final ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(c10.b((Type) list.get(i10), d.f8425a, null));
        }
        final List list2 = this.f15432b;
        final JsonAdapter jsonAdapter = this.f15433c;
        final String str = "type";
        final List list3 = this.f15431a;
        return new JsonAdapter<Object>(str, list3, list2, arrayList, jsonAdapter) { // from class: com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory$PolymorphicJsonAdapter
            final JsonAdapter<Object> fallbackJsonAdapter;
            final List<JsonAdapter<Object>> jsonAdapters;
            final String labelKey;
            final m labelKeyOptions;
            final m labelOptions;
            final List<String> labels;
            final List<Type> subtypes;

            {
                this.labelKey = str;
                this.labels = list3;
                this.subtypes = list2;
                this.jsonAdapters = arrayList;
                this.fallbackJsonAdapter = jsonAdapter;
                this.labelKeyOptions = m.a(str);
                this.labelOptions = m.a((String[]) list3.toArray(new String[0]));
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final Object a(n nVar) throws IOException {
                o oVar = (o) nVar;
                oVar.getClass();
                o oVar2 = new o(oVar);
                try {
                    int iF = f(oVar2);
                    oVar2.close();
                    return iF == -1 ? this.fallbackJsonAdapter.a(nVar) : this.jsonAdapters.get(iF).a(nVar);
                } catch (Throwable th) {
                    oVar2.close();
                    throw th;
                }
            }

            @Override // com.squareup.moshi.JsonAdapter
            public final void e(s sVar, Object obj) {
                JsonAdapter<Object> jsonAdapter2;
                int iIndexOf = this.subtypes.indexOf(obj.getClass());
                if (iIndexOf == -1) {
                    jsonAdapter2 = this.fallbackJsonAdapter;
                    if (jsonAdapter2 == null) {
                        throw new IllegalArgumentException("Expected one of " + this.subtypes + " but found " + obj + ", a " + obj.getClass() + ". Register this subtype.");
                    }
                } else {
                    jsonAdapter2 = this.jsonAdapters.get(iIndexOf);
                }
                sVar.e();
                if (jsonAdapter2 != this.fallbackJsonAdapter) {
                    sVar.w(this.labelKey);
                    sVar.N(this.labels.get(iIndexOf));
                }
                int iE = sVar.E();
                if (iE != 5 && iE != 3 && iE != 2 && iE != 1) {
                    throw new IllegalStateException("Nesting problem.");
                }
                int i11 = sVar.f15489x;
                sVar.f15489x = sVar.f15483r;
                jsonAdapter2.e(sVar, obj);
                sVar.f15489x = i11;
                sVar.i();
            }

            public final int f(o oVar) throws C0736j, EOFException {
                oVar.e();
                while (oVar.w()) {
                    if (oVar.V(this.labelKeyOptions) != -1) {
                        int iX = oVar.X(this.labelOptions);
                        if (iX != -1 || this.fallbackJsonAdapter != null) {
                            return iX;
                        }
                        throw new A6.a("Expected one of " + this.labels + " for key '" + this.labelKey + "' but found '" + oVar.L() + "'. Register a subtype for this label.");
                    }
                    oVar.b0();
                    oVar.c0();
                }
                throw new A6.a("Missing label for " + this.labelKey);
            }

            public final String toString() {
                return p.B(new StringBuilder("PolymorphicJsonAdapter("), this.labelKey, ")");
            }
        }.c();
    }

    public final c b(Class cls, String str) {
        List list = this.f15431a;
        if (list.contains(str)) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList(this.f15432b);
        arrayList2.add(cls);
        return new c(arrayList, arrayList2, this.f15433c);
    }
}
