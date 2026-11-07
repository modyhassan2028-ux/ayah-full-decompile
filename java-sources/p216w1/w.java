package p216w1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Iterable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f23624r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f23625s;

    public w(Context context) {
        this.f23625s = context;
    }

    public final void b(ComponentName componentName) {
        Context context = this.f23625s;
        ArrayList arrayList = this.f23624r;
        int size = arrayList.size();
        try {
            for (Intent intentA = e.a(context, componentName); intentA != null; intentA = e.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public final void c() {
        ArrayList arrayList = this.f23624r;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f23625s.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f23624r.iterator();
    }
}
