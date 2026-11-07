package V1;

import android.content.Context;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final boolean a(Context context, String str) {
        j.e(context, "context");
        j.e(str, "name");
        return context.deleteSharedPreferences(str);
    }
}
