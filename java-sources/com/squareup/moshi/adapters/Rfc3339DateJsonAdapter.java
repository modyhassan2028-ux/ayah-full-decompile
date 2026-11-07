package com.squareup.moshi.adapters;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import com.squareup.moshi.s;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class Rfc3339DateJsonAdapter extends JsonAdapter<Date> {
    @Override // com.squareup.moshi.JsonAdapter
    public final void e(s sVar, Object obj) {
        Date date = (Date) obj;
        synchronized (this) {
            try {
                if (date == null) {
                    sVar.A();
                } else {
                    sVar.N(a.b(date));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final synchronized Date a(n nVar) {
        if (nVar.N() == 9) {
            nVar.H();
            return null;
        }
        return a.d(nVar.L());
    }
}
