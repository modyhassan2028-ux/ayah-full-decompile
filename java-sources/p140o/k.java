package p140o;

import B1.a;
import I1.AbstractC0245c;
import I1.T;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k implements Menu {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f20133y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f20135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f20138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f20139f;
    public final ArrayList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f20141i;
    public final ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f20142k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f20144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f20145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f20146o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m f20153v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20155x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20143l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f20147p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f20148q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f20149r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20150s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f20151t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f20152u = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20154w = false;

    public k(Context context) {
        boolean zS;
        boolean z10 = false;
        this.f20134a = context;
        Resources resources = context.getResources();
        this.f20135b = resources;
        this.f20139f = new ArrayList();
        this.g = new ArrayList();
        this.f20140h = true;
        this.f20141i = new ArrayList();
        this.j = new ArrayList();
        this.f20142k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = T.f3695a;
            if (Build.VERSION.SDK_INT >= 28) {
                zS = a.s(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zS = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zS) {
                z10 = true;
            }
        }
        this.f20137d = z10;
    }

    public m a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f20133y[i14] << 16) | (65535 & i12);
        m mVar = new m(this, i10, i11, i12, i15, charSequence, this.f20143l);
        ArrayList arrayList = this.f20139f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((m) arrayList.get(size)).f20165d <= i15) {
                i13 = size + 1;
                arrayList.add(i13, mVar);
                p(true);
                return mVar;
            }
        }
        i13 = 0;
        arrayList.add(i13, mVar);
        p(true);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f20134a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            m mVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            mVarA.setIcon(resolveInfo.loadIcon(packageManager));
            mVarA.g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = mVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(w wVar, Context context) {
        this.f20152u.add(new WeakReference(wVar));
        wVar.i(context, this);
        this.f20142k = true;
    }

    public final void c(boolean z10) {
        if (this.f20150s) {
            return;
        }
        this.f20150s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f20152u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            w wVar = (w) weakReference.get();
            if (wVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                wVar.b(this, z10);
            }
        }
        this.f20150s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        m mVar = this.f20153v;
        if (mVar != null) {
            d(mVar);
        }
        this.f20139f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f20145n = null;
        this.f20144m = null;
        this.f20146o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(m mVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f20152u;
        boolean zM = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f20153v == mVar) {
            y();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                w wVar = (w) weakReference.get();
                if (wVar != null) {
                    zM = wVar.m(mVar);
                    if (zM) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            x();
            if (zM) {
                this.f20153v = null;
            }
        }
        return zM;
    }

    public boolean e(k kVar, MenuItem menuItem) {
        i iVar = this.f20138e;
        return iVar != null && iVar.q(kVar, menuItem);
    }

    public boolean f(m mVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f20152u;
        boolean zF = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            w wVar = (w) weakReference.get();
            if (wVar != null) {
                zF = wVar.f(mVar);
                if (zF) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        x();
        if (zF) {
            this.f20153v = mVar;
        }
        return zF;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f20139f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f20162a == i10) {
                return mVar;
            }
            if (mVar.hasSubMenu() && (menuItemFindItem = mVar.f20174o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final m g(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f20151t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (m) arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            char c10 = zN ? mVar.j : mVar.f20168h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i10 == 67))) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f20139f.get(i10);
    }

    public final void h(List list, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList arrayList = this.f20139f;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                m mVar = (m) arrayList.get(i11);
                if (mVar.hasSubMenu()) {
                    mVar.f20174o.h(list, i10, keyEvent);
                }
                char c10 = zN ? mVar.j : mVar.f20168h;
                if ((modifiers & 69647) == ((zN ? mVar.f20170k : mVar.f20169i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zN && c10 == '\b' && i10 == 67)) && mVar.isEnabled()) {
                        list.add(mVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f20155x) {
            return true;
        }
        ArrayList arrayList = this.f20139f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((m) arrayList.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f20142k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f20152u;
            boolean zJ = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                w wVar = (w) weakReference.get();
                if (wVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zJ |= wVar.j();
                }
            }
            ArrayList arrayList = this.f20141i;
            ArrayList arrayList2 = this.j;
            if (zJ) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    m mVar = (m) arrayListL.get(i10);
                    if ((mVar.f20183x & 32) == 32) {
                        arrayList.add(mVar);
                    } else {
                        arrayList2.add(mVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f20142k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z10 = this.f20140h;
        ArrayList arrayList = this.g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f20139f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = (m) arrayList2.get(i10);
            if (mVar.isVisible()) {
                arrayList.add(mVar);
            }
        }
        this.f20140h = false;
        this.f20142k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f20154w;
    }

    public boolean n() {
        return this.f20136c;
    }

    public boolean o() {
        return this.f20137d;
    }

    public void p(boolean z10) {
        if (this.f20147p) {
            this.f20148q = true;
            if (z10) {
                this.f20149r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f20140h = true;
            this.f20142k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f20152u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        y();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            w wVar = (w) weakReference.get();
            if (wVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                wVar.e(z10);
            }
        }
        x();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        m mVarG = g(i10, keyEvent);
        boolean zQ = mVarG != null ? q(mVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b3 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, w wVar, int i10) {
        AbstractC0245c abstractC0245c;
        boolean zExpandActionView;
        AbstractC0245c abstractC0245c2;
        boolean z10;
        C c10;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        w wVar2;
        m mVar = (m) menuItem;
        boolean zL = false;
        if (mVar == null || !mVar.isEnabled()) {
            return false;
        }
        k kVar = mVar.f20173n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = mVar.f20175p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(mVar)) && !kVar.e(kVar, mVar)) {
            Intent intent = mVar.g;
            if (intent != null) {
                try {
                    kVar.f20134a.startActivity(intent);
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    abstractC0245c = mVar.f20159A;
                    if (abstractC0245c == null) {
                    }
                    zExpandActionView = false;
                    abstractC0245c2 = mVar.f20159A;
                    if (abstractC0245c2 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (mVar.e()) {
                        zExpandActionView |= mVar.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (mVar.hasSubMenu()) {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!mVar.hasSubMenu()) {
                            C c11 = new C(this.f20134a, this, mVar);
                            mVar.f20174o = c11;
                            c11.setHeaderTitle(mVar.f20166e);
                        }
                        c10 = mVar.f20174o;
                        if (z10) {
                            ((n) abstractC0245c2).f20187c.onPrepareSubMenu(c10);
                        }
                        copyOnWriteArrayList = this.f20152u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (wVar != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                wVar2 = (w) weakReference.get();
                                if (wVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zL) {
                                    zL = wVar2.l(c10);
                                }
                            }
                        }
                        zExpandActionView |= zL;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i10 & 4) == 0) {
                            c(false);
                        }
                        if (!mVar.hasSubMenu()) {
                            C c12 = new C(this.f20134a, this, mVar);
                            mVar.f20174o = c12;
                            c12.setHeaderTitle(mVar.f20166e);
                        }
                        c10 = mVar.f20174o;
                        if (z10) {
                            ((n) abstractC0245c2).f20187c.onPrepareSubMenu(c10);
                        }
                        copyOnWriteArrayList = this.f20152u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zL = wVar != null ? wVar.l(c10) : false;
                            while (r8.hasNext()) {
                                wVar2 = (w) weakReference.get();
                                if (wVar2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zL) {
                                    zL = wVar2.l(c10);
                                }
                            }
                        }
                        zExpandActionView |= zL;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                abstractC0245c = mVar.f20159A;
                if (abstractC0245c == null && ((n) abstractC0245c).f20187c.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        abstractC0245c2 = mVar.f20159A;
        if (abstractC0245c2 == null && ((n) abstractC0245c2).f20187c.hasSubMenu()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (mVar.e()) {
            zExpandActionView |= mVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (mVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!mVar.hasSubMenu()) {
                C c13 = new C(this.f20134a, this, mVar);
                mVar.f20174o = c13;
                c13.setHeaderTitle(mVar.f20166e);
            }
            c10 = mVar.f20174o;
            if (z10) {
                ((n) abstractC0245c2).f20187c.onPrepareSubMenu(c10);
            }
            copyOnWriteArrayList = this.f20152u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (wVar != null) {
                }
                while (r8.hasNext()) {
                    wVar2 = (w) weakReference.get();
                    if (wVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zL) {
                        zL = wVar2.l(c10);
                    }
                }
            }
            zExpandActionView |= zL;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(w wVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f20152u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            w wVar2 = (w) weakReference.get();
            if (wVar2 == null || wVar2 == wVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList = this.f20139f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (((m) arrayList.get(i12)).f20163b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((m) arrayList.get(i12)).f20163b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList = this.f20139f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((m) arrayList.get(i11)).f20162a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i11);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f20139f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList arrayList = this.f20139f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f20163b == i10) {
                mVar.f(z11);
                mVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f20154w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f20139f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f20163b == i10) {
                mVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList arrayList = this.f20139f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            m mVar = (m) arrayList.get(i11);
            if (mVar.f20163b == i10) {
                int i12 = mVar.f20183x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                mVar.f20183x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f20136c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f20139f.size();
    }

    public final void t(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f20152u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference weakReference : copyOnWriteArrayList) {
                w wVar = (w) weakReference.get();
                if (wVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = wVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        wVar.c(parcelable);
                    }
                }
            }
        }
    }

    public final void u(Bundle bundle) {
        int size = this.f20139f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C) item.getSubMenu()).u(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void v(Bundle bundle) {
        Parcelable parcelableK;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.f20152u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            w wVar = (w) weakReference.get();
            if (wVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = wVar.getId();
                if (id > 0 && (parcelableK = wVar.k()) != null) {
                    sparseArray.put(id, parcelableK);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    public final void w(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f20146o = view;
            this.f20144m = null;
            this.f20145n = null;
        } else {
            if (i10 > 0) {
                this.f20144m = this.f20135b.getText(i10);
            } else if (charSequence != null) {
                this.f20144m = charSequence;
            }
            if (i11 > 0) {
                this.f20145n = this.f20134a.getDrawable(i11);
            } else if (drawable != null) {
                this.f20145n = drawable;
            }
            this.f20146o = null;
        }
        p(false);
    }

    public final void x() {
        this.f20147p = false;
        if (this.f20148q) {
            this.f20148q = false;
            p(this.f20149r);
        }
    }

    public final void y() {
        if (this.f20147p) {
            return;
        }
        this.f20147p = true;
        this.f20148q = false;
        this.f20149r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f20135b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f20135b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        m mVarA = a(i10, i11, i12, charSequence);
        C c10 = new C(this.f20134a, this, mVarA);
        mVarA.f20174o = c10;
        c10.setHeaderTitle(mVarA.f20166e);
        return c10;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f20135b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f20135b.getString(i13));
    }

    public k k() {
        return this;
    }
}
