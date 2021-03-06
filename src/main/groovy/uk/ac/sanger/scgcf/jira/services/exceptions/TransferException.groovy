/**
 * See README.md for copyright details
 */
package uk.ac.sanger.scgcf.jira.services.exceptions

/**
 * The {@code TransferException} class represents an error with a labware transfer.
 *
 * @author ke4
 *
 */
class TransferException extends Exception {
    TransferException(message) {
        super(message)
    }
}
