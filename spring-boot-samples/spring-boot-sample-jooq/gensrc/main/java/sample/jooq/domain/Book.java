/**
 * This class is generated by jOOQ
 */
package sample.jooq.domain;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "https://www.jooq.org",
		"jOOQ version:3.8.2" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Book extends TableImpl<Record> {

	private static final long serialVersionUID = 1176189796;

	/**
	 * The reference instance of <code>PUBLIC.BOOK</code>
	 */
	public static final Book BOOK = new Book();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>PUBLIC.BOOK.ID</code>.
	 */
	public final TableField<Record, Integer> ID = createField("ID",
			org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.BOOK.AUTHOR_ID</code>.
	 */
	public final TableField<Record, Integer> AUTHOR_ID = createField("AUTHOR_ID",
			org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.BOOK.TITLE</code>.
	 */
	public final TableField<Record, String> TITLE = createField("TITLE",
			org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.BOOK.PUBLISHED_IN</code>.
	 */
	public final TableField<Record, Integer> PUBLISHED_IN = createField("PUBLISHED_IN",
			org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.BOOK.LANGUAGE_ID</code>.
	 */
	public final TableField<Record, Integer> LANGUAGE_ID = createField("LANGUAGE_ID",
			org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>PUBLIC.BOOK</code> table reference
	 */
	public Book() {
		this("BOOK", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.BOOK</code> table reference
	 */
	public Book(String alias) {
		this(alias, BOOK);
	}

	private Book(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private Book(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return Public.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<Record> getPrimaryKey() {
		return Keys.CONSTRAINT_1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<Record>> getKeys() {
		return Arrays.<UniqueKey<Record>>asList(Keys.CONSTRAINT_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<Record, ?>> getReferences() {
		return Arrays.<ForeignKey<Record, ?>>asList(Keys.FK_BOOK_AUTHOR,
				Keys.FK_BOOK_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Book as(String alias) {
		return new Book(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public Book rename(String name) {
		return new Book(name, null);
	}

}
