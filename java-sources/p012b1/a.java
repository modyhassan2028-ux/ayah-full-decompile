package p012b1;

import R7.f;
import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LocaleList f13140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f13141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f13142t = new f(24);

    @Override // p012b1.d
    public final Locale b(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (j.a(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    @Override // p012b1.d
    public final c c() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f13142t) {
            c cVar = this.f13141s;
            if (cVar != null && localeList == this.f13140r) {
                return cVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new b(localeList.get(i10)));
            }
            c cVar2 = new c(arrayList);
            this.f13140r = localeList;
            this.f13141s = cVar2;
            return cVar2;
        }
    }
}
