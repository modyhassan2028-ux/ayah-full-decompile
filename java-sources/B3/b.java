package B3;

import E2.W;
import F2.u;
import F2.v;
import L2.h;
import L2.i;
import com.ayah.common.data.source.database.AyahDatabase_Impl;
import com.ayah.common.data.source.database.BookDatabase_Impl;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p017b7.g;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends W {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f598d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BookDatabase_Impl bookDatabase_Impl) {
        super(1, "365e2fe35ef81e0562f3870821519bd9", "a1ed277cbabab9e77103fcc92f433f38");
        this.f599e = bookDatabase_Impl;
    }

    @Override // E2.W
    public final void a(Q2.a aVar) {
        switch (this.f598d) {
            case 0:
                j.e(aVar, "connection");
                u0.o(aVar, "CREATE TABLE IF NOT EXISTS `favorites` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ayah_id` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL)");
                u0.o(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_favorites_ayah_id` ON `favorites` (`ayah_id`)");
                u0.o(aVar, "CREATE TABLE IF NOT EXISTS `notes` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ayah_id` INTEGER NOT NULL, `note` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
                u0.o(aVar, "CREATE UNIQUE INDEX IF NOT EXISTS `index_notes_ayah_id` ON `notes` (`ayah_id`)");
                u0.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                u0.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4d89e72e89c7797ad12641e4777b4979')");
                break;
            default:
                j.e(aVar, "connection");
                u0.o(aVar, "CREATE TABLE IF NOT EXISTS `bookEntry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `kind` TEXT NOT NULL, `text` TEXT NOT NULL, `emphases` TEXT, `chapterNumber` INTEGER NOT NULL, `pageNumber` INTEGER NOT NULL, `verseNumber` INTEGER, `verseID` INTEGER)");
                u0.o(aVar, "CREATE INDEX IF NOT EXISTS `bookEntry_kind` ON `bookEntry` (`kind`)");
                u0.o(aVar, "CREATE INDEX IF NOT EXISTS `bookEntry_pageNumber` ON `bookEntry` (`pageNumber`)");
                u0.o(aVar, "CREATE INDEX IF NOT EXISTS `bookEntry_verseID` ON `bookEntry` (`verseID`)");
                u0.o(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                u0.o(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '365e2fe35ef81e0562f3870821519bd9')");
                break;
        }
    }

    @Override // E2.W
    public final void c(Q2.a aVar) {
        switch (this.f598d) {
            case 0:
                j.e(aVar, "connection");
                u0.o(aVar, "DROP TABLE IF EXISTS `favorites`");
                u0.o(aVar, "DROP TABLE IF EXISTS `notes`");
                break;
            default:
                j.e(aVar, "connection");
                u0.o(aVar, "DROP TABLE IF EXISTS `bookEntry`");
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // E2.W
    public final void r(Q2.a aVar) {
        switch (this.f598d) {
        }
        j.e(aVar, "connection");
    }

    @Override // E2.W
    public final void s(Q2.a aVar) {
        switch (this.f598d) {
            case 0:
                j.e(aVar, "connection");
                ((AyahDatabase_Impl) this.f599e).i(aVar);
                break;
            default:
                j.e(aVar, "connection");
                ((BookDatabase_Impl) this.f599e).i(aVar);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // E2.W
    public final void t(Q2.a aVar) {
        switch (this.f598d) {
        }
        j.e(aVar, "connection");
    }

    @Override // E2.W
    public final void u(Q2.a aVar) {
        switch (this.f598d) {
            case 0:
                j.e(aVar, "connection");
                B9.a.r(aVar);
                break;
            default:
                j.e(aVar, "connection");
                B9.a.r(aVar);
                break;
        }
    }

    @Override // E2.W
    public final v v(Q2.a aVar) {
        switch (this.f598d) {
            case 0:
                j.e(aVar, "connection");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("_id", new L2.f("_id", "INTEGER", true, 1, null, 1));
                linkedHashMap.put("ayah_id", new L2.f("ayah_id", "INTEGER", true, 0, null, 1));
                linkedHashMap.put("timestamp", new L2.f("timestamp", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                linkedHashSet2.add(new h("index_favorites_ayah_id", true, AbstractC0813f2.K("ayah_id"), AbstractC0813f2.K("ASC")));
                i iVar = new i("favorites", linkedHashMap, linkedHashSet, linkedHashSet2);
                i iVarM0 = g.m0(aVar, "favorites");
                if (!iVar.equals(iVarM0)) {
                    return new v("favorites(com.ayah.common.data.source.model.Favorite).\n Expected:\n" + iVar + "\n Found:\n" + iVarM0, false);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("_id", new L2.f("_id", "INTEGER", true, 1, null, 1));
                linkedHashMap2.put("ayah_id", new L2.f("ayah_id", "INTEGER", true, 0, null, 1));
                linkedHashMap2.put("note", new L2.f("note", "TEXT", true, 0, null, 1));
                linkedHashMap2.put("timestamp", new L2.f("timestamp", "INTEGER", true, 0, null, 1));
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                linkedHashSet4.add(new h("index_notes_ayah_id", true, AbstractC0813f2.K("ayah_id"), AbstractC0813f2.K("ASC")));
                i iVar2 = new i("notes", linkedHashMap2, linkedHashSet3, linkedHashSet4);
                i iVarM1 = g.m0(aVar, "notes");
                if (iVar2.equals(iVarM1)) {
                    return new v(null, true);
                }
                return new v("notes(com.ayah.common.data.source.model.Note).\n Expected:\n" + iVar2 + "\n Found:\n" + iVarM1, false);
            default:
                j.e(aVar, "connection");
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put("id", new L2.f("id", "INTEGER", true, 1, null, 1));
                linkedHashMap3.put("kind", new L2.f("kind", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("text", new L2.f("text", "TEXT", true, 0, null, 1));
                linkedHashMap3.put("emphases", new L2.f("emphases", "TEXT", false, 0, null, 1));
                linkedHashMap3.put("chapterNumber", new L2.f("chapterNumber", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("pageNumber", new L2.f("pageNumber", "INTEGER", true, 0, null, 1));
                linkedHashMap3.put("verseNumber", new L2.f("verseNumber", "INTEGER", false, 0, null, 1));
                linkedHashMap3.put("verseID", new L2.f("verseID", "INTEGER", false, 0, null, 1));
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                linkedHashSet6.add(new h("bookEntry_kind", false, AbstractC0813f2.K("kind"), AbstractC0813f2.K("ASC")));
                linkedHashSet6.add(new h("bookEntry_pageNumber", false, AbstractC0813f2.K("pageNumber"), AbstractC0813f2.K("ASC")));
                linkedHashSet6.add(new h("bookEntry_verseID", false, AbstractC0813f2.K("verseID"), AbstractC0813f2.K("ASC")));
                i iVar3 = new i("bookEntry", linkedHashMap3, linkedHashSet5, linkedHashSet6);
                i iVarM2 = g.m0(aVar, "bookEntry");
                if (iVar3.equals(iVarM2)) {
                    return new v(null, true);
                }
                return new v("bookEntry(com.ayah.common.data.source.model.BookEntry).\n Expected:\n" + iVar3 + "\n Found:\n" + iVarM2, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AyahDatabase_Impl ayahDatabase_Impl) {
        super(3, "4d89e72e89c7797ad12641e4777b4979", "6ed84a75e3413f04f4facfc0a1678d58");
        this.f599e = ayahDatabase_Impl;
    }
}
